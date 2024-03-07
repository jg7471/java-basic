package video.user.service;

import oop_JG.A06modi.member.pac1.A;
import video.common.AppService;
import video.user.domain.Grade;
import video.user.domain.User;
import video.user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static video.ui.AppUi.*;

public class UserService implements AppService { //구현하고 추상메서드(Override) 해야함

    private final UserRepository userRepository = new UserRepository(); //객체 생성 // private 클래스에서만 사용(외부접근 막기)// 주소값변경 막기 final

    @Override
    public void start() {
        while (true) { //유저서비스 안에서 계속 놀게끔(아니면 맨 처음으로 돌아감)
            userManagementScreen();//import static 함
            int selection = inputInteger(">>>"); //유틸

            switch (selection) {
                case 1:
                    join(); //private 메소드 생성 : 유저 서비스 내부에서만 사용
                    break;

                case 2:
                    showSearchUser();
                    break;

                case 3:
                    deleteUser();
                    break;

                case 4:
                    return;//start() return0번 끝 //메서도 강제 종료해서 초기 화면으로 돌아갈 수 있도록 처리, 처음으로 돌아가기
                //break; //필요없음

                default:
                    System.out.println("# 메뉴를 다시 입력하세요");

            }

        }

    }
    //이름을 입력받아 해당 이름이 포함된 객체 리스트를 리턴하는 기능
    private List<User> searchUser(){
        System.out.println("\n### 조회할 회원의 이름을 입력하세요.");
        String name = inputString(">>>");
        return userRepository.findUserByName(name); //@@@ 소문자?
    }



    //단손 조회결과 출력 //ctrl alt N ??? 아놔 @@@
    private void showSearchUser() {

        List<User> users = searchUser();

        if (users.size() > 0) {
            System.out.println("\n==============회원결과 조회=================");
            for(User user : users){
                System.out.println(user);
            }

        } else {
            System.out.println("\n### 조회 결과가 없습니다.");

        }
    }

    //회원 추가 비즈니스 로직
    //비즈니스 로직 : 요청애 따른 데이터의 생성, 조회, 저장, 변경 등의 로직.
    private void join() {
        System.out.println("\n===== 회원가입을 진행합니다 =====");
        String name = inputString("# 회원명 :");

        String phone = inputString("# 전화번호 :");

        //입력받은 값을 토대로 User 객체 생성(등급은 BRONZE)
        User newUser = new User(name, phone, Grade.BRONZE);//신규 회원 등급 bronze 세팅

        userRepository.addUser(newUser);//신규회원저장
        System.out.printf("\n### [%s]님의 회원가입이 완료되었습니다", newUser.getUserName());
    }

    //회원 탈퇴 비즈니스 로직 : 호출되는 순서로 작성함
    private void deleteUser() {
        //searchUser();//void임-> list 주게 나눴음 : 여기서도 조회하고 싶어서
        List<User> users = searchUser();

        if(users.size() > 0){
            List<Integer> userNums = new ArrayList<>(); //삭제 대상 회원 번호를 저장할 리스트 -> 탈퇴할 회원 번호를 입력시 삭제 대상번호를 입력한건지 확인용

            for(User user : users){
                System.out.println(user);
                userNums.add(user.getUserNumber()); // arraylist에 추가
            }
            System.out.println("\n 탈퇴할 회원의 번호를 입력하세요");
            int delUserNum = inputInteger(">>>");

            if(userNums.contains(delUserNum)){
                User delUser = userRepository.deleteUser(delUserNum);
                System.out.printf("\n### %s[%s] 님의 회원정보가 정삭 삭제되었습니다.\n", delUser.getUserName(), delUser.getUserName());
            } else {
                System.out.println("\n ### 검색한 회원의 회원버놓로만 삭제가 가능합니당");
            }

        } else {
            System.out.println("\n조회 결과는 없습니다.");
        }
    }


}