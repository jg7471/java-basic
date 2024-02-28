package oop_JG.A10final_.constant;

public class Earth {

     /*
     # 상수 (constant) : static final

     - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도
      같은 값이 나와야 하며, 값의 변경 또한 불가능해야 합니다.

     - 따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용합니다.
     */

    //static final 보통 이렇게 사용
    static final double RADIUS = 6400; // 지구의 반지름 : static 누구나 공통, final 불변 :
    //대문자로 작성 관례(static X final)
    static final double SURFACE_AREA; // 두 단어 합칠 경우, 대문자만 사용해서, 카멜케이스 대신 _ 사용
    //final : 초기값 필수

    static{ // static의 정적 초기화
        SURFACE_AREA = RADIUS * RADIUS * 4 * Math.PI; //PI도 상수임 :고정된 불변의 값

    }

}
