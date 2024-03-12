package Subway.service;

import Subway.repository.SubwayStaffRepository;
import util.Utility;

import java.security.PrivateKey;
import java.util.List;

import static Subway.repository.SubwayStaffRepository.searchStaffList;

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
            String choice = Utility.input(" 데이터 입력→");


            switch (choice) {
                case "1":
                    manageStaff();
                    break;

                case "2":

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
}

