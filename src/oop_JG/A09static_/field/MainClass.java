package oop_JG.A09static_.field;

import oop_JG.A06modi.member.pac2.C;

public class MainClass {

    public static void main(String[] args) {

        Count c1 = new Count();

        c1.a += 5;
        c1.b += 5;
        System.out.println("인스턴스 변수 c1.a = " + c1.a); //0+5
        System.out.println("정적 변수 c1.b = " + c1.b); //0+5

        System.out.println("------------------------------");
        Count c2 = new Count(); //새 객체 생성

        c2.a += 7;
        c2.b += 7;

        System.out.println("인스턴스 변수 c1.a = " + c2.a); //0+7
        System.out.println("정적 변수 c2.b = " + c2.b); //5+7

        System.out.println("------------------------------");

        Count c3 = new Count();

        c3.a += 8;
        c3.b += 8;

        //static은 저장되는 공간 따로 있음 //객체에 존재 하지 않음
        //모든 객체가 하나의 값을 참조
        System.out.println("인스턴스 변수 c1.a = " + c3.a); //0+8
        System.out.println("정적 변수 c3.b = " + c3.b); //5+7+8 //스태틱은 이런식으로 표기ㄴㄴ
        System.out.println("정적 변수 c1.b = " + c1.b); //20
        System.out.println("정적 변수 c2.b = " + c2.b); //20

        /*
         - static이 붙은 데이터는 그 static 데이터가 선언된
          클래스의 이름으로 바로 참조할 수 있습니다.
         - 일반 멤버변수(필드)와 혼동할 가능성이 있기 때문에
          주소값으로 접근하지 않습니다.
         */

        //static : 공유변수/전역변수 : static 메서드 : 객체생성 없이 바로 호출 가능
        //static과 객체는 상관없음 주소로 접근사용XX, 클래스 이름으로 사용 : Count
        Count.b++; //20+1
        Count.b++; //21+1

        System.out.println("정적 변수 Count.b: " + Count.b);



    }
}