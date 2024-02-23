package basic_JG.A06constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {

         /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1:");
        int num1 = sc.nextInt();

        System.out.println("연산 선택[+, -, *, /]: ");
        String operator = sc.next();

        System.out.println("정수 2:");
        int num2 = sc.nextInt();
        int result = 0;
        boolean flag = false;

        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다");
                    flag = true;
                    //깃발 변수 //기본적으로 false 인데 하나라도    찾을 시 깃발을 들어라
                    break;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("연산 기호를 정확하게 입력하세요. [+, -, *, /]");
        }
        if(!flag){//flag false라는 의미
        System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);
        }
        sc.close();
        /* 내가 입력
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        switch (num1){
            case '+' :
                int num2 = sc.nextInt();
                System.out.println(num1 + num2);
                break;
        }
       */


    }
}
