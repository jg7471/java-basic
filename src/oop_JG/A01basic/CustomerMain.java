package oop_JG.A01basic;

public class CustomerMain {
    public static void main(String[] args) {

        Customer Fujiko = new Customer();
        Customer Akane = new Customer();
        Customer Yukiko = new Customer();
        Customer Asuka = new Customer();

        Fujiko.name = "Fujiko";
        Fujiko.city = "Tokyo Shinjuku";
        Fujiko.hobby = "English";
        Fujiko.age = 1998;
        Fujiko.height = 167;

        Akane.name = "Akane";
        Akane.city = "Chiba";
        Akane.hobby = "Tennis";
        Akane.age = 2000;
        Akane.height = 170;

        Yukiko.name = "Yukiko";
        Yukiko.city = "Fukuoka";
        Yukiko.hobby = "Korean";
        Yukiko.age = 2002;
        Yukiko.height = 166;

        Asuka.name = "Asuka";
        Asuka.city = "Osaka";
        Asuka.hobby = "Cooking";
        Asuka.age = 1999;
        Asuka.height = 168;

        Fujiko.hello();
        Akane.hello();
        Yukiko.hello();
        Asuka.hello();

        System.out.println(Fujiko);
        System.out.println(Akane);
        System.out.println(Yukiko);
        System.out.println(Asuka);


    }
}


