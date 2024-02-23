package basic_JG.A06constate;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("점수 입력하세여");
        int point = sc.nextInt();

        //switch 정수/문자열/연산의 결과값 :: 实数X
        switch (point / 10) { // 94/10=9.5 int값은 소수점 뗌

            case 10:
                if (point > 100) { //101~109점 점수X
                    System.out.println("잘못된 값");
                    break;
                }
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                if (point > 100 || point < 0) {
                    System.out.println("점수 잘못 입력");
                }
                System.out.println("F");
        }
    }
}
