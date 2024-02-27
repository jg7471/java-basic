package oop_JG.A01basic;

public class A4FieldMain {

    public static void main(String[] args) {

        A3FieldAndLocal fl = new A3FieldAndLocal(); // 클래스 호출 @@  변수는?? -> 객체생성
        fl.a = 5;
        fl.printNumber(4); // 매개변수는 초기화 안줘도 호출 가능(무조건 값 대입해야함)
        fl.foo(); //메서드(객체함수) 호출 //"필드 a = " + a




    }
}
