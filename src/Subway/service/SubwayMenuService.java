package Subway.service;

import Subway.domain.Menu;
import Subway.repository.SubwayStaffRepository;

import java.lang.reflect.Member;
import java.util.*;

import static Subway.repository.SubwayStaffRepository.searchStaffList;
import static util.Utility.*;

public class SubwayMenuService {
    static Scanner scanner = new Scanner(System.in);


    private static SubwayStaffRepository ss;
    private static ArrayList<Menu> list = new ArrayList<>();

    static {
        ss = new SubwayStaffRepository();
    }

    public static void start() {

        while (true) {
            System.out.println("메뉴를 선택하세요");
            System.out.println("1. 직원관리");
            System.out.println("2. 메뉴선택");
            System.out.println("3. 매장관리");
            System.out.println("4. 데이터저장");
            System.out.println("5. 프로그램종료");

            System.out.println("원하시는 기능을 선택하세요");
            int choice = numInput();


            switch (choice) {
                case 1:

                    manageStaff();
                    break;

                case 2:
                    createBread();

                    break;

                case 3:
                    makeVegetable();

                    break;

                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("잘못된 입력값 입니다.");

            }

        }


    }


    public static void manageStaff() {
        System.out.println("현재 근무중 직원리스트");
        searchStaffList();
    }


//    private static void createMenu() {
//        System.out.println("메뉴를 선택해주세요 1. 먹고가기 2.포장하기");
//        int num = numInput();
//        if (num = 1) {
//            System.out.println("먹고가기 메뉴입니다");
//
//
//        } else if (num = 2) {
//            System.out.println("포장하기 메뉴입니다");
//
//
//        } else {
//            System.out.println("잘못된 값입니다.");
//        }
//        System.out.println(" ");
//    }

    private static void createBread() {

        List<String> breadSize = new ArrayList<>();

        System.out.println("빵 크기를 선택하세요");
        System.out.println("1. 15cm 2. 30cm");
        int num1 = numInput(); //입력값 정수로 받음

        try {
            switch (num1) {
                case 1:
                    breadSize.add("15cm");
                    System.out.println("빵 크기 15cm를 선택하셨습니다");
                    break;
                case 2:
                    breadSize.add("30cm");
                    System.out.println("빵 크기 30cm를 선택하셨습니다");
                    break;
            }
        } catch (Exception e) {
            System.out.println("# 올바른 정수 입력값이 아닙니다");
        }
//        finally {
//            numInput(); //★ 추가할 기능 : 무한루프 방지
//        }

        makeVegetable();
    }


    private static void makeVegetable() { //plan B

        //Collections 클래스로 직접 문자열을 저장하는 것은 불가능합니다

        Menu.refrigerator();
        List<String> choiceVegetable = new ArrayList<>(); //★리스트 사이즈로 확인해야함 :리스트 크기 고정 X 계속 늘어남
        System.out.println("야채를 하세요(중복선택 가능)");
        System.out.println("0. 양상추, 1. 토마토, 2. 오이, 3. 피망, 4. 양파, 5. 피클, 6. 올리브, 7. 할라피뇨 8. 모든 야채 제외, 9. 선택완료");



        while (true) {
            //int num1 = numInput(); 필요없음

            //★추가할 기능 : num1 중복시 다시 입력하는 기능

            for (String value : choiceVegetable)


            //System.out.println(choiceVegetable.add(choiceVegetable.get(num1))); // 선택한 값 추가
            String input = scanner.next();
            choiceVegetable.add(input);
            for (String value : choiceVegetable) {
                System.out.println(value);


                //int[] arry = new int[]{num1}; //리스트로변경



                //xianeml.tistory.com/39 [미현 개발 TIL:티스토리]

                //System.out.println(num1.get(i)); //num1은 int형이기 때문에 get() 메서드를 사용할 수 없습니다.


                if (Objects.equals(input, "9")) {
                    System.out.println("선택을 완료 하셨습니다.");
                    //System.out.println("선택하신 메뉴: " + Arrays.toString(arry));
                    System.out.println("toString() 전체 출력: " + choiceVegetable);

                    //★추가할 기능 : 선택완료시 메뉴 선택한거 전부 출력

                    //for (String s :choiceVegetable) { choiceVegetable : 전체값 나옴
                    //    System.out.println("선택하신 야채 : "+s+",");
                    //}
                    break;
                }

                //add(객체): 리스트에 객체를 추가하는 메서드
                //get(인덱스) : 리스트 내부의 객체를 참조하는 메서드
                //choiceVegetable.set(i, choice);//에러


            }
        }


        // 추가해야 할 기능
//        System.out.println("빵 종류를 하세요");
//        System.out.println("1. 화이트 2. 파마산 오레가노 3. 위트 4. 허니오트 5. 하티 6. 플랫브레드");
//        int num2 = numInput();
//
//        System.out.println("토스팅하시겠습니까?");
//        boolean num3 = numInput();
//
//        System.out.println("치즈를 선택하세요");
//        System.out.println("1. 아메리칸치즈, 2. 슈레드치즈 3. 모짜렐라치즈 4. 치즈제외");
//        int num4 = numInput();
//
//        System.out.println("선택하신 메뉴입니다", num1, num2, num3, num4);
//
//    }


//@@ 질문 매개변수 입력은 왜 안되나요?
//    private static List<String> makeVegetable(int choiceVeg) {
//
//        //Collections 클래스로 직접 문자열을 저장하는 것은 불가능합니다
//        List<String> choiceVegetable = new ArrayList<>(9);
//
//        choiceVegetable.add("양상추");
//        choiceVegetable.add("토마토");
//        choiceVegetable.add("오이");
//        choiceVegetable.add("피망");
//        choiceVegetable.add("양파");
//        choiceVegetable.add("피클");
//        choiceVegetable.add("올리브");
//        choiceVegetable.add("할라피뇨");
//        choiceVegetable.add("모든야채제외");
//        choiceVegetable.add("선택완료");
//
//        System.out.println("야채를 하세요(중복선택 가능)");
//        System.out.println("0. 양상추, 1. 토마토, 2. 오이, 3. 피망, 4. 양파, 5. 피클, 6. 올리브, 7. 할라피뇨 8. 모든 야채 제외, 9. 선택완료");
//            for (int i = 0; i < choiceVegetable.size(); i++) {
//                choiceVegetable.add(choiceVegetable.get(choiceVeg)); //사용자 입력값 choice
//                //add(객체): 리스트에 객체를 추가하는 메서드
//                //get(인덱스) : 리스트 내부의 객체를 참조하는 메서드
//                //choiceVegetable.set(i, choice);//에러
//                if (choiceVeg == 9) {
//                    System.out.println("선택을 완료 하셨습니다.");
//                }
//                System.out.println("선택하신 메뉴" + choiceVeg);
//            }
//        return choiceVegetable;
//    }


//    private List<String> makeSauce() {
//        List<String> choiceSauce = new ArrayList<>();
//        System.out.println("소스/시즈닝을 선택하세요(중복선택 가능)");
//        System.out.println("1. 랜치, 2. 스위트 어니언, 3. 마요네즈, 4. 스위트 칠리, 5. 스모크 바비큐, 6. 핫 칠리, 7. 머스타드, 8. 올리브 오일, 9. 레드와인 식초, 10. 소금, 11. 후추, 12. 선택안함");
//    }


    }
}

