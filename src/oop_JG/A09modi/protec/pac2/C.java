package oop_JG.A09modi.protec.pac2;

import oop_JG.A09modi.protec.pac1.*;

public class C extends A { //상속받는다



    //A a1 = new A(30); X
    //A a2 = new A(5.67); X

    public C(){

        /*
        - protected 제한자는 패키지가 다른 경우
        두 클래스 사이에 상속 관계가 존재한다면
        super 키워드를 통해 참조를 허용

        */

        super(30); //protected 상속 ok
        //super(3.14);//default 라 안됨 상속X

        super.x = 1; //protected
        //super.y = 2; //default

        super.method1();
        //super.method2(); //default

    }


}