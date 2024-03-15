package Subway.service;

import Subway.domain.Menu;
import Subway.repository.SubwayStaffRepository;
import util.Utility;
import video.movie.domain.Movie;

import java.io.LineNumberInputStream;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

import static Subway.repository.SubwayStaffRepository.searchStaffList;
import static util.Utility.input;
import static util.Utility.numInput;

public class SubwayMenuService {


    private static SubwayStaffRepository ss;

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
            String choice = Utility.input(" 데이터 입력→ ");


            switch (choice) {
                case "1":
                    manageStaff();
                    break;

                case "2":
                    createMenu();

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "5":

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


    private static void createMenu() {
        System.out.println("메뉴를 선택해주세요 1. 먹고가기 2.포장하기");
        int num = numInput();
        if (num = 1) {
            System.out.println("먹고가기 메뉴입니다");


        } else if (num = 2) {
            System.out.println("포장하기 메뉴입니다");


        } else {
            System.out.println("잘못된 값입니다.");
        }
        System.out.println(" ");
    }

    private static void createBread() {
        System.out.println("빵 크기를 선택하세요");
        System.out.println("1. 15cm 2. 30cm");
        int num1 = numInput();

        System.out.println("빵 종류를 하세요");
        System.out.println("1. 화이트 2. 파마산 오레가노 3. 위트 4. 허니오트 5. 하티 6. 플랫브레드");
        int num2 = numInput();

        System.out.println("토스팅하시겠습니까?");
        boolean num3 = numInput();

        System.out.println("치즈를 선택하세요");
        System.out.println("1. 아메리칸치즈, 2. 슈레드치즈 3. 모짜렐라치즈 4. 치즈제외");
        int num4 = numInput();

        System.out.println("선택하신 메뉴입니다", num1, num2, num3, num4);

    }

    private List<Menu> makeVegetable(int choice) {


        while (true) {
            System.out.println("야채를 하세요(중복선택 가능)");
            System.out.println("1. 양상추, 2. 토마토, 3. 오이, 4. 피망, 5. 양파, 6. 피클, 7. 올리브, 8. 할라피뇨 9. 모든 야채 제외, 99. 선택완료");
            List<Menu> choiceVegetable = new ArrayList<>();
            choice = input();
            for (int i = 0; i < choiceVegetable.get(9); i++) {
                choiceVegetable[i] = choice;
                if(choice == 99){
                    System.out.println("선택을 완료 하셨습니다.");
                }
                System.out.println("선택하신 메뉴", vegList[i]);
            }
        }

        return choiceVegetable;
    }

    private List<String> makeSauce() {
        List<String> choiceSauce = new ArrayList<>();
        System.out.println("소스/시즈닝을 선택하세요(중복선택 가능)");
        System.out.println("1. 랜치, 2. 스위트 어니언, 3. 마요네즈, 4. 스위트 칠리, 5. 스모크 바비큐, 6. 핫 칠리, 7. 머스타드, 8. 올리브 오일, 9. 레드와인 식초, 10. 소금, 11. 후추, 12. 선택안함");
    }


}

