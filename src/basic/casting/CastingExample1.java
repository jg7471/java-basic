package basic.casting;

public class CastingExample1 {

    public static void main(String[] args) {

        /*
         - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
          자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
          (promotion, UpCasting)
         */

        //컵에 담긴 물을 바가지에 붙는..
        byte b = 10;
        int i = b; //byte의 값이 int로 맞춰 변환 후 대입 연산 진행
        System.out.println("i = " + i);

        char c = '가';
        int j = c; // char -> int 변환
        System.out.println("'가'의 문자 번호 : "+j);
       
        int k = 500;
        double d = k;
        System.out.println("d = " + d);


    }

    
}
