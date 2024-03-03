package oop_JG.A13inter;

//인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할
public interface Inter {

    //interface //틀만 짜는 역할 -> 클래스가 필요->저장기능 X : static : 저장공간 따로 있음 : 인터페이스가 저장이 아니라 다른 곳에 저장 : 다만 선언만 되었을 뿐


    //인터페이스에서 변수를 선언하면 상수(static final)로 인식
    //int num = 5;//final 성질 : 상수로 인식
    int NUM = 5; //요렇게 초기화

    //Inter(){
    //인터페이스는 생성자를 가질 수 없음(객체화 될 수 없는 개념)
    //}

    //인터페이스에서 메서드를 선언하면 추상 메서드로 지정됨
    //void method1(){}
    void method1();

    public static void staticMethod(){
        System.out.println("static method 선언가능");
    }//(static 은 저장공간 별도라 인터페이스에서도 사용 가능

}