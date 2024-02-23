package basic_JG.A06constate;

import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력하세여");
        System.out.print(">");
        String gender = sc.next();

        /*
         switch 괄호 안에 지정하신 기준값에 따라
         만족하는 case문을 순서대로 탐색합니다.
         적합한 case가 존재하는 경우에는 해당 case에
         종속된 문장을 실행합니다.
         따로 조치가 없다면 나머지 케이스들이 연속적으로 실행됩니다.
         */

        //범위 넓을 경우 not good

        switch (gender){

            case "M": case "m": case "ㅡ": //내용이 공백이라 밑으로 흘러감
                System.out.println("남성");
                break;

            case "F": case "f": case "ㄹ":
                System.out.println("여성");
                break;

            default: //case를 설정하지 않은 값든은 모두 default
                System.out.println("잘못된 입력값");
        }
    sc.close();
    }
}
