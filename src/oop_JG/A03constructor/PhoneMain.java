package oop_JG.A03constructor;

import java.util.Scanner;

public class PhoneMain {
//메인 = 출력
    public static void main(String[] args) {

        //Scanner sc =new Scanner() 생성자
        Phone basic = new Phone(); // 생성자 호출!
        //생성자 기본적으로 하나 세팅됨 // 클래스명(Phone과 이름 같아야함)
//결과값
//        System.out.println("기본 생성자 호출!"); //Phone에서 기본값 호출됨
//        model = "폴더폰";
//        color = "회색";
//        price = "20000";
        basic.showSpec();

        System.out.println("-----------------------------------------------");

        Phone glaxy = new Phone("갤럭시 s24"); //glaxy 생성자 변수 바꿈 //생성자 여러개 만들 수 있음(매개값 받을 수 있음)
        glaxy.showSpec();

        System.out.println("-----------------------------------------------");

        Phone iPhone = new Phone("아이폰 15", "스페이스 그레이");
        iPhone.showSpec();

    }
}
