package oop_JG.A03constructor;

public class CustomerMain {
    public static void main(String[] args) {

        Customer no1 = new Customer();
        no1.name = "Sakura";
        no1.age = 20000403;
        no1.hometown = "Tokyo";
        no1.hello();

        System.out.println("_______");
        Customer no2 = new Customer("Sakura", "Osaka");
        no2.hello();


    }
}