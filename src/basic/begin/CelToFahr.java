package basic.begin;

import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         사용자에게 섭씨온도를 입력받아서
         화씨온도로 변환하여 출력하는 로직을 작성하세요.
         변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
         화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
         # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
         */

        System.out.println("섭씨온도를 입력하세요");
        String degree = sc.next();

        //내가 작성 //정답
        double temp = Double.parseDouble(degree);
        double ondo = temp * 9/5+32;
        System.out.println("섭씨온도" +temp+ "℃의 화씨온도는" +ondo+ "℉ 입니다");
        //복붙 키 crtl+D

        sc.close(); //이거 빼먹음
        //선생님꺼 복붙 하셈




    }
}
