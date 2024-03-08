package video.order.service;

import video.common.AppService;
import video.movie.domain.Movie;
import video.movie.repository.MovieRepository;
import video.order.domain.Order;
import video.user.domain.User;
import video.user.repository.UserRepository;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static video.ui.AppUi.*;

public class OrderService implements AppService {

    private final MovieRepository movieRepository = new MovieRepository();//대여가 가능한 영화 목록을 호출하기 위한 메서드
    private final UserRepository userRepository = new UserRepository();

    @Override
    public void start() {
        while (true) {
            orderManagementScreen(); //import
            int selection = inputInteger(">>>");

            switch (selection) {
                case 1:
                    processOrderDvd();
                    break;
                case 2:
                    showRentalPossibleList();
                    return;
                case 3:
//                    processReturnDVD();

                    return;

                default:
                    System.out.println("\n ### 메뉴를 다시 입력하세여");

            }
        }
    }


    //DVD 대여 서비스 비즈니스 로직
    private void processOrderDvd() {
        while (true) {
            System.out.println("\n============================ 대여관리 시스템을 실행합니다. ============================");
            System.out.println("[ 1. 대여 가능 DVD 목록 보기 | 2. 대여중인 영화 반납예정일 확인하기 | 3. 이전으로 돌아가기 ]");
            int selection = inputInteger(">>>"); //중복 이름 허용 각가 다르니까???


            switch (selection) {
                case 1:
                    showRentalPossibleList();
                    break;
                case 2:
                    showRentalImossibleList();

                    return;
                case 3:

                    return;

                default:
                    System.out.println("\n ### 메뉴를 다시 입력하세여");


            }
        }
    }


    //대여가 가능한 DVD 목록 보기
    private void showRentalPossibleList() {
        List<Movie> movieList = movieRepository.searchByRental(true);//대여가 가능한 목록 : 파서블 트루:
        int count = movieList.size();//변수는 count에 담기

        List<Integer> movieNums = new ArrayList<>();

        if (count > 0) {
            System.out.printf("\n==================================== 검색 결과 (총 %d건) ====================================\n", count);
            for (Movie movie : movieList) {
                System.out.println(movie);
                movieNums.add(movie.getSerialNumber());
            }
            System.out.println("==========================================================================================");
            System.out.println("### 대여할 DVD의 번호를 입력하세요.");
            int movieNumber = inputInteger(">>> ");

            if (movieNums.contains(movieNumber)) {
                rentalProcess(movieNumber);
            } else {
                System.out.println("\n### 대여가 가능한 영화 목록중에 선택해야 합니다.");
            }
        } else {
            System.out.println("\n### 대여 가능한 DVD가 없습니다 ㅠㅠ");
        }
    }


    private void rentalProcess(int movieNumber) {
        Movie rentalMovie = movieRepository.searchMovie(movieNumber); //rentalMovie로 변수 설정
        System.out.printf("\n ### [%s] DVD를 대여합니다 \n", rentalMovie.getMovieName());
        System.out.println("### 대여자 이름을 입력하세요");
        String name = inputString(">>>");

        List<User> users = userRepository.findUserByName(name);//users 리스트 전부가져오기
        //List<User> 리턴 타입

        if (users.size() > 0) {
            List<Integer> userNums = new ArrayList<>();

            System.out.println("\n==============회원결과 조회=================");
            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber());
            }
            System.out.println("===========================================");
            System.out.println("## 대여할 회원의 회원번호를 입력하세여.");
            int userNumber = inputInteger(">>>");

            if (userNums.contains(userNumber)) {
                //대여 완료처리
                User rentalUser = userRepository.findUserByNumber(userNumber); //렌탈 유저 정보 획득
                rentalMovie.setRental(true); //대여상태를 대여중으로 변경
                rentalMovie.setRentalUser(rentalUser); //영화 객체에 렌탈 유저 등록

                rentalUser.setTotalPaying(rentalMovie.getCharge()); //영화 대여 금액을 회원 총 결제금액에 누적 갱신

                //새로운 주문 생성
                Order newOrder = new Order(rentalUser, rentalMovie);
                rentalUser.addOrder(newOrder); //회원 대여 목록에 주문을 추가.

                String phoneNumber = rentalUser.getPhoneNumber(); //출력문을 위해 얻은 전화번호

                // lastIndexOf(str): 해당 문자열의 위치를 뒤에서부터 탐색
                // 뒤에서부터 탐색을 시작해서 "-"을 찾아라 -> 그 "-" 이후로 부터 끝까지 추출하라.
                System.out.printf("\n### [%s(%s) 회원님] 대여 처리가 완료되었습니다. 감사합니다!\n"
                        , rentalUser.getUserName(), rentalUser.getPhoneNumber().substring(phoneNumber.lastIndexOf("-" + 1)));//subString 뒷번호 -뒤 부터

                System.out.printf("### 현재 등급: [%s], 총 누적 결제금액: %d원\n", rentalUser.getGrade(), rentalUser.getTotalPaying());


            } else {
                System.out.println("\n ###검색된 회원의 번호를 입력하세요.");
            }

        } else {
            System.out.println("\n ### 대여자 정보가 없습니다.");
        }


    }

    //대여중(대여 불가능한) DVD 목록보기
    private void showRentalImossibleList() {
        List<Movie> movieList = movieRepository.searchByRental(false);
        int count = movieList.size();

        if (count > 0) {
            System.out.printf("\n==================================== 검색 결과 (총 %d건) ====================================\n", count);
            for (Movie movie : movieList) {
                User rentalUser = movie.getRentalUser();
                String PhoneNumber = rentalUser.getPhoneNumber();
                String lastPhoneNumber = PhoneNumber.substring(PhoneNumber.lastIndexOf("-") + 1);
                System.out.printf("### 영화명 : %s 현재 대여자 %s(%s) 반납예정일 %s\n,"
                        , movie.getMovieName(), rentalUser.getUserName(), lastPhoneNumber,
                        rentalUser.getOrderList().get(movie.getSerialNumber()).getReturnDate()); // 겟오더 맵 받고,. 넘버받고, 렌트일 바딕
            }
            System.out.println("==========================================================================================");


        } else {
            System.out.println("\n ###대여 불가능한 DVD가 없습ㄴ디ㅏ");

        }
    }

    //DVD 반납 서비스 비즈니스 로직
//    private void processReturnDVD() {
//        System.out.println("=======================반납 관리 시스템을 실행합니다.=======================");
//        System.out.println("### 반납자의 이름을 입력하세요");
//        String name = inputString(">>>");
//
//        List<User> users = userRepository.findUserByName(name);
//        int count = users.size();
//
//        if (count > 0) {
//            List<Integer> userNums = new ArrayList<>();
//            System.out.printf("\n==================================== 검색 결과 (총 %d건) ====================================\n", count);
//            for (User user : users) {
//                System.out.println(user);
//                userNums.add(user.getUserNumber());//몰래 몰래 넘버 넣는다
//            }
//            System.out.println("==========================================================================================");
//
//            System.out.println("### 반납자의 회원 번호를 입력하세요");
//            int userNumber = inputInteger(">>>");
//
//            if (userNums.contains(userNumber)) {
//                returnProcess(userNumber);
//
//            } else {
//                System.out.println("\n### 조회된 회원 번호를 입력하세여 합니다.");
//            }
//
//        } else {
//            System.out.println("\n### 반납자의 정보가 없습니다.");
//        }
//
//    }

//    private void returnProcess(int userNumber) {
//        // 매개값으로 전달된 회원 번호를 통해 회원 객체를 받아야 한다.
//        // "XXX 회원님의 대여 목록입니다" 라고 하면서 orderList 내의 모든 객체를 보여주어야 한다.
//        // 반납할 DVD의 번호를 입력받아야 한다.
//        // 입력한 번호가 대여중인 DVD인지 검증해야 한다. (아무 번호나 입력하지 않았는지 확인)
//        // 대여중인 DVD가 맞다면 반납처리를 본격적으로 진행한다.
//        // 영화 객체에서 회원정보를 삭제한다. -> rentalUser 필드 값을 null로 세팅
//        // 영화 객체의 대여 가능 여부를 변경해야 한다.
//        // 연체료 발생 여부를 확인하여 연체료가 존재한다면 추가로 얼마를 결제하라고 출력문을 띄워야 하고,
//        // 연체료가 없다면 반납이 완료되었다는 출력문을 보여주어야 한다.
//
//        User returnUser = UserRepository.findUserByNumber(userNumber); // UserRepository.findUserByNumber(userNumber); 왜 오류??
//        System.out.printf("\n### 현재 [%s] 회원님의 대여 목록입니다.\n", returnUser.getUserName());
//        System.out.println("===============================================================");
//        Map<Integer, Order> orderList = returnUser.getOrderList(); //대여한 목록 들어옴
//        for (int ket : orderList.keySet()) { //Integer -> int 변환
//            System.out.println(orderList.get(Key)); //이미 연체료 계산 1)
//        }
//        System.out.println("===============================================================");
//        System.out.println("### 반납할 DVD의 번호를 입력하세요.");
//        int returnMovieNumber = inputInteger(">>>");
//
//        if(orderList.containsKey(returnMovieNumber)) {//Map 영화번호 키가 존재함
//            Movie returnMovie = movieRepository.searchByRental(returnMovieNumber); //movie 객체
//            returnMovie.setRentalUser(null);
//            returnMovie.setRental(false);//대여 가능?? : 확인 필요
//
//            Order returnOrder = orderList.get(returnMovieNumber); //order 객체
//            //System.out.println(returnOrder); //2) 중복이라 지움 //toString을 호출해야 연체료가 계산된다 //(returnOrder.toString) 생략됨
//            int overdueCharge = returnOrder.getOverdueCharge();
//            if(overdueCharge > 0){
//                System.out.printf("\n### 반납이 완료되었습니다. %d원을 추가로 결제해 주세요!\n", overdueCharge);
//            }else{
//                System.out.println("### 반납완료 ???");
//            }
//
//        } else {
//            System.out.println("\n### 해당 DVD는 반납 대상이 아닙니다.");
//
//        }
//
//
//
//        /*//내가 작성
//        //List<User> users = userRepository.findUserByNumber(userNumber); //요건 왜 userNumber 추가가 안되는거 //List<User> 의미
//        User rentalUser = userRepository.findUserByNumber(userNumber);
//        System.out.printf("%s 회원님의 대여 목록 %s 입니다.", rentalUser, rentalProcess(userNumber);
//        User rentalUser = movie.getRentalUser(); //userNumber.setSequence // 3번 유저가 Movie 정보 get 해야하는데
//        users.remove(user);
//        */
//
//
//
//
//
//
//
//    }
}