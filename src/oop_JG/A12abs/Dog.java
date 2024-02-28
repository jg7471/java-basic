package oop_JG.A12abs;

public class Dog extends Pet{ //상속받으려면 메서드 구현 alt insert
    public Dog(String name, String kind, int age) { //부모의 생성자 호출 ...??? @@@ 이유
        super(name, kind, age);
    }
    @Override
    public void takeNap() {
        System.out.println("강아지는 마당에 쿨쿨쿨~!");

    }

    //상속관계에선 슈퍼를 통해 부모생성자 호출
    //기본 생성자가 없음

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 와구와구");

    }

    @Override
    public void walk() {
        System.out.println("강이지는 산책을 좋아해요");

    }
}
