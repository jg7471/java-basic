package etc_JG.exception.A01basic;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        //main 선언시 utility 사용 불가//???
        Scanner sc = new Scanner(System.in);

        System.out.println("정수1");
        int i = sc.nextInt();
        System.out.println("정수2");
        int j = sc.nextInt();

        System.out.println("나눗셈 시작");

        // ctrl alt t 감싸기 단축키
        try { // try 블록에는 예외 발생 가능성이 있는 코드를 배치
            System.out.printf("%d / %d = %d\n", i, j, i/j); //0으로 나눌시 오류 뜸
        } catch (Exception e) { //클래스 타입 : 오류는 대부분 Exception의 자식들
            //catch 블록에는 try 블록에서 실제 예외가 발생했을 경우
            //실행할 코드를 작성
            System.out.println("0으로 나누시면 어떡해요");
        }

        System.out.println("프로그램 종료");

        /*
         # 예외 처리
         - 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것.
         - 예외 처리는 시스템 스스로 오류를 복구하는 것이 아니고
          오류 발생 가능성이 있는 부분에 대한 처리를 미리 준비하는 것입니다.
         - 시스템의 비정상적 종료를 막고 코드의 흐름이 계속될 수 있도록
          사전에 준비하는 행위를 말합니다.
         */

        sc.close();

    }
}
