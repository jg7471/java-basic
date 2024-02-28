package oop_JG.A09static_.method;

import util.Utility;
import static util.Utility.*; //Utility의 모든 메서드 불러오기 //단축키 ??alt enter?

public class MainClass {

    public static void main(String[] args){

        Count c = new Count();
        int result = c.method1();

        int result2 = Count.method2(); //static method2 호출 방법

        Utility.makeLine();//밑줄 그어지는 Utility.static method 호출 //단축키 ??alt enter?
        makeLine();

        String name = input("이름을 입력하세여: "); //utility 메서드 사용
        System.out.println("name = "+ name);

    }
}
