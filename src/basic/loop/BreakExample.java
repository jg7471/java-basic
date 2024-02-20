package basic.loop;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            if (i > 6) break;
            System.out.print(i + " ");
        }
        System.out.println("\n반복문 종료!");

        System.out.println("----------------------");
        for (int i = 0; i < 11; i++) {
            if (i == 6) continue; //건너 뛰어라
            System.out.print(i + " ");
        }
        System.out.println("\n반복문 종료!");
        //while continue 해당회차 무효, 다시 진행
        //for contiune 회차 건너 뜀

        System.out.println("----------------------");

        Scanner sc = new Scanner(System.in); //객체


        System.out.println("15*6=???");//문제는 한번만 보여줘도 됨
        System.out.println("정답을 모르면 0->종료");

        while (true) {
            System.out.println(">");
            int answer = sc.nextInt(); //입력

            if (answer == 90) {
                System.out.println("정답");
                break;
            } else if (answer == 0) {
                System.out.println("정답은 90");
                break;
            } else {
                System.out.println("틀렸습니다");
                //continue;
                //label 문법 ★ outer
            }
        }
    }
}