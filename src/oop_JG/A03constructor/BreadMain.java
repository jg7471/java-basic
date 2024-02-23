package oop_JG.A03constructor;

public class BreadMain {
    public static void main(String[] args) {

        //내가 작성
        /*
        Bread basic = new Bread();
        basic.showSpce();
        String breadName = "피자빵";
        int price = 1000;
        String ingredient = "밀가루";
        */
        Bread p = new Bread();
        p.name = "피자빵";
        p.price = 1000;
        p.ingredient = "밀가루";
        p.info();

        System.out.println("-----------------");

        Bread c = new Bread("초코케이크", 3000, "초콜렛");
        c.info();
    }
}
