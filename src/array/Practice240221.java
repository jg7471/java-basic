package array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice240221 {
    public static void main(String[] args) {

        //Ctrl + Shift + F
        //Scanner
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        String degree = sc.next();//공백 미포함
        //next(): 공백이 없는 문자열을 입력받습니다.
        //nextLine(): 공백을 포함한 문자를 입력받습니다.
        //nextInt(): 정수 데이터를 입력받습니다.
        //nextDouble(): 실수 데이터를 입력받습니다.
        sc.close();

        //print
        int month = 12;
        int day = 25;
        String anni = "크리스마스";

        // 12월 25일은 크리스마스 입니다.
        System.out.println(month+"월"+day+"일은"+anni+ "입니다");
        System.out.printf("%d월 %d일은 %s 입니다.", month, day, anni);
        //%d : 정수, %f : 실수, %s 문자
        //\n 줄 개행 \t 가로 공백(스페이스 4칸)

        //double rate = 64.126; // %.(2f)(%%)
        //System.out.printf("합격률: %.2f%%", rate); //64.13%

        int i = 72;
        char c = (char)i; //上->下

        double d = 4.98765;
        int j = (int) d; //4

        int k = 10;
        double d = k / 4; //int 와 int의 계산이라 소숫점 버림
        System.out.println("d = " + d); //2

        if(j % 136 == 0);

        //3항 연산
        int x = 10, y = 20;
        String result = x > y ? "x는 y보다 큽니다" : "x는 y보다 작습니다.";
        String result = (rn % 2 == 0) ? "짝" : "홀";

        int rn = (int) (Math.random()*355 + 42); //42 ~ 396사이의 난수
        int rn = (int) (Math.random()*10 + 1); //1~10
        int rn2 = (int) (Math.random()*91 + 10); //10~100 @@@

        boolean flag = false;
        if(!flag){
            System.out.println("flag = " + flag);//false ?@@@
        }


        //switch 정수/문자열/연산의 결과값 :: 实数X
        switch (point / 10) { // 94/10=9.5 int값은 소수점 뗌


    }
}

