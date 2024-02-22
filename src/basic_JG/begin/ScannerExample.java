package basic_JG.begin;

//1. Scanner API 로딩(제공되는 Scanner 클래스 정보를 현재 클래스로 가져오기)
//2. import 필수(자동입력됨)
import java.util.Scanner; // 쓰지마세요(Scanner 입력시 자동생성)

public class ScannerExample {

    public static void main(String[] args) {
        // 2. 변수 sc에 Scanner 객체 생성(사실은 sc에 new Scanner의 주소값만 들어가 있음)
        Scanner sc = new Scanner(System.in); //new를 붙임 //자바의 표준 입력 명명
        //class type : Scanner
/*
         3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
         - next(): 공백이 없는 문자열을 입력받습니다.
         - nextLine(): 공백을 포함한 문자를 입력받습니다.
         - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
         ex)
             nextInt(): 정수 데이터를 입력받습니다.
             nextDouble(): 실수 데이터를 입력받습니다.
         */

        System.out.println("이름을 입력하세요 : ");
        String name = sc.next(); //공백 미포함
        //String name = sc.nextLine(); //공백 포함
        //보통은 HTML으로 값 입력 받는다
        System.out.println("name = " + name); //printf 고대로, println 줄개행

        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();//next~ 각 타입에 맞는 값에 맞게 생성해야 함

        System.out.printf("제 이름은 %s이고, 나이는 %d세 입니다.\n", name, age); //print

        // 4. 스캐너 객체를 반납
        // 객체를 반납 -> Scanner 객체를 메모리에서 해제
        sc.close(); //그래야 메모리 누수가 없다 // 한번 닫히면 못 열음, 마지막에 사용해라

    }
}