package video.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUi {

    private static Scanner sc = new Scanner(System.in); //누구나 접근 못하게 but static

    public static String inputString(String message) { //스트링
        System.out.println(message);//매개값으로 전달받은 메세지를 출력하겠다
        return sc.nextLine();
    }

    public static int inputInteger(String message) { //정수
        System.out.println(message);
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("# 올바른 정수 입력값이 아닙니다");
        } finally {
            sc.nextLine(); //무한 루프 막아줌 : 공백발생
            //1입력하고 엔터하는거 까지 참고해야함 : try catch에 모두 enter(nextLine)필요
            //try에서도 (엔터 입력값), catch에서도 (쓰레기 문자열 수거) nextLine()이 동작해야함
        }

        return num;
        //return sc.nextInt(); //정수가 아닌 값 오면 error-> 예외처리
    }

    public static void makeLine() {
        System.out.println("===========================");//줄 그어주는 메소드
    }

    //시작 화면 출력
    public static void startScreen() {
        System.out.println("\n========= DVD 대여 관리 시스템 =========");
        System.out.println("### 1. 회원 관리 시스템");
        System.out.println("### 2. 대여 주문 관리 시스템");
        System.out.println("### 3. 영화 DVD 관리 시스템");
        System.out.println("### 4. 프로그램 종료");
        makeLine();
    }

    //회원관리 시스템 화면 출력
    public static void userManagementScreen() {
        System.out.println("\n========= 회원 관리 시스템 =========");
        System.out.println("### 1. 신규 회원 추가");
        System.out.println("### 2. 회원 검색");
        System.out.println("### 3. 회원 탈퇴");
        System.out.println("### 4. 첫 화면으로 가기");
        makeLine();
    }

    //영화 관리 시스템 화면 출력
    public static void movieManagementScreen() {
        System.out.println("\n========= 영화 DVD 관리 시스템 =========");
        System.out.println("### 1. 신규 영화 DVD 추가");
        System.out.println("### 2. 영화 DVD 정보 검색");
        System.out.println("### 3. 영화 DVD 정보 삭제");
        System.out.println("### 4. 첫 화면으로 가기");

    }

    //대여 주문 관리 시스템 화면 출력
    public static void orderManagementScreen() {
        System.out.println("\n========= 대여 주문 관리 시스템 =========");
        System.out.println("### 1. 영화 DVD 대여하기");
        System.out.println("### 2. 영화 DVD 반납하기");
        System.out.println("### 3. 첫 화면으로 가기");
        makeLine();
    }
}