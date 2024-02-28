package oop_JG.A10final_.method;

public class Child extends Parent{ //parent 상속 : class 에 final 붙일시 상속 받기 불가


    //ctrl o 오버라이딩


    @Override
    void method1() {
        super.method1();
    }

    @Override
    void method2() {
        super.method2();
    }

    //final method 는 override 를 막습니다 : 주는대로 써라~
//    @Override //method 에 final 붙이면 override 불가 : 재정의 하는 것 -> final : 바꾸지 말고 그대로 쓰라
//    void method3() {
//        System.out.println("오버라이딩 해야지~");
//        super.method3();
//    }

}
