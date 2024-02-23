package oop_JG.A3constructor;

public class BreadMain {
    public static void main(String[] args) {

        //내가 작성
        Bread basic = new Bread();
        basic.showSpce();
        String breadName = "피자빵";
        int price = 1000;
        String ingredient = "밀가루";

        System.out.println("-----------------");

        Bread choco = new Bread("초코케이크",3000,"초콜릿");
        choco.showSpce();
    }
}
