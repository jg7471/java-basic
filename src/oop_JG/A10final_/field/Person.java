package oop_JG.A10final_.field;

public class Person {
    //final 변수는 불변의 값을 의미 그렇게 때문에 반드시 초기화가 필요
    //초기화는 직접 하는 방법과, 생성자를 이용하는 방법이 있음

    final String nation = "대한민국"; //자바스크립트 const 비슷
    final String name ;
    int age;

    //final 초기화 : 1)직접, 2)생성자 이용초기화

    //public Person(){} 허용하지 않음

    public Person(String name) { //무조건 요렇게 alt+insert
        this.name = name;
    }
}
