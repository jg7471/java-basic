package basic_JG.A01begin;

public class VariableExample {

    public static void main(String[] args) {
        /*
         # 변수 (Variable)

         1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
         2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
         적당한 데이터 타입을 선언해야 합니다.
         ex) int: 4바이트의 정수, String: 문자열(문장)
         3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
         4. 변수 내부의 값은 언제든지 변경이 가능합니다.
         */

        //변수의 선언: [자료형(데이터)타입] [변수명];
        int age;

        //변수의 초기화: [변수명] = [값];
        age = 40;

        //변수의 값 참조(사용)
        System.out.println(age);
        System.out.println("age = " + age); //soutv
        
        // 변수는 처음 선언과 초기화를 동시에 할 수 있습니다
        // 처음 만들 때 한 번만 가능 (데이터 타입이 앞에 붙었다는 것은, 새롭게 선언한다는 의미)
        int score = 90;
        //int score = 95;(x)
        score = 95; // 데이터 타입 안붙을 경우, 기존의 변수 참조
        System.out.println("score = " + score);

        //변수에는 다른 변수의 값도 저장이 가능합니다.
        int myScore = score - 20;
        System.out.println("myScore = " + score);

        // 변수의 자료형에 맞지 않는 데이터는 저장 불가 //자바스크립트와 다름
        //int count = "one"; //string
        //int count = 23.5 //(X)
        //String str = 100; x 문자 선언 - 숫자

        //변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면 중복선언 X
        String name = "홍길동"; //문자열 무조건 ""
        //int name = 1004; //데이터 타입 구분하여 저장되지 않음

        // 선언 및 초기화하지 않은 변수는 사용이 불가합니다
        // int result = myScore + num; //num 선언한 적 없음

        int result;
        //System.out.println("result =" + result); //X 초기화(result에 값을 담고)가 필요
        
    }

}
