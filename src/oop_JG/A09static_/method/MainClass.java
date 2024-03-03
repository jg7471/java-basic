package oop_JG.A09static_.method;

import util.Utility;
import static util.Utility.*; //Utility의 모든 메서드 불러오기 //단축키 ??alt enter?

public class MainClass {
    //static 공통기능
    //각각의 개체별로 다르게


    public static void main(String[] args){

        //static에서 this 사용 불가 //객체 생성하지 않고(static) 그냥 호출하면(static) 객체없어서 this 호출 불가 = statc 에서 this 사용불가

        Count c = new Count(); // a와 method1 값 //method1 에는 a값만 있고, Count.b(static)의 값은 다른 곳에 저장 되 있음
        int result = c.method1(); //1번 메소드 호출

        int result2 = Count.method2(); //static method2 호출 방법 : static은 직접 호출 가능!!! //위의 1번은 method1을 호출하기 위해 주소로 호출

        makeLine();//감싸고 alt enter//밑줄 그어지는 Utility.static method 호출 //단축키 ??alt enter?
        //------------- 선 그어지는 method Uitilty에 등록함

        String name = input("이름을 입력하세여: "); //utility 메서드 사용
        System.out.println("name = "+ name);

    }
}
