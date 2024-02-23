package oop_JG.A3constructor;

public class PhoneMain {

    public static void main(String[] args) {

        Phone basic = new Phone();//생성자가 기본적으로 하나 세팅됨
//        System.out.println("기본 생성자 호출!"); //Phone에서 기본값 호출됨
//        model = "폴더폰";
//        color = "회색";
//        price = "20000";
        basic.showSpec();

        System.out.println("-----------------------------------------------");

        Phone glaxy = new Phone("갤럭시 s24"); //생성자 여러개 만들 수 있음(매개값 받을 수 있음)
        glaxy.showSpec();

        System.out.println("-----------------------------------------------");

        Phone iPhone = new Phone("아이폰 15", "스페이스 그레이");
        iPhone.showSpec();


    }
}