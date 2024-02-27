package oop_JG.A11poly.car;

public class Sonata extends Car{ //부모 Car 상속

    //부모값 오버라이딩 ctrl O ->직속부모 car or object 선택 가능

    @Override
    public void run() {
        //super.run(); //부모의 run 상속
        System.out.println("쏘나타가 달립니다");
    }
}
