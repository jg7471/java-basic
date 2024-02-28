package oop_JG.A13inter.animal;

public interface Animal {

    //    String name;//추상클래스 != 인터페이스 -> 인터페이스는 필드에 생성 불가 -> 기능만 명세
    //    int age;

    //내가 앞으로 만들 클래스의 기능을 명세
    void feed(String foodName); //추상 메서드

    boolean sleep();


}
