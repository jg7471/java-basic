package basic_JG.casting;

public class CastingExample2 {

    public static void main(String[] args) {

        /*
         - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
          반드시 형 변환 연산자: (type)를 사용하여 명시적으로
          형 변환을 진행해 주셔야 합니다. (DownCasting)

         - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
          저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
          (overflow, underflow)
        */

        //바가지에 담긴 물을 컵에 붙는..
        int i = 72;
        char c = (char)i; //downCasting 직접 내려야함 상위->하위
        System.out.println("c = " + c);
        //자바는 한줄이라도 오류 생기면 작동 안됨 컴파일 방식
        //자바스크립트는 대화형 형식
        
        double d = 4.98765;
        int j = (int) d; //alt enter 인텔리J의 해결제안 : 자주씀
        System.out.println("j = " + j);
        System.out.println("여러분들의 이번 달 월급 = " + j*1000000); //소숫점 날아감

        int k = 1000;
        byte b = (byte) k; // byte는 1000을 표현할 수 없음 : 값 손실
        System.out.println("b = " + b);

    }
}
