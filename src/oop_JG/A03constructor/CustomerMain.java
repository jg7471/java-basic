package oop_JG.A03constructor;

public class CustomerMain {
    public static void main(String[] args) {

        Customer a = new Customer();
        a.name = "Fujiko";
        a.age = 23;
        a.city = "Tokyo";
        a.nationality = "Japan";
        a.hobby = "Cooking";
        a.info();

        System.out.println("----------");
        Customer b = new Customer("Yaxuan", 24, "Shanghai", "China", "Piano");
        b.info();

        System.out.println("----------");
        Customer c = new Customer("Aling", 24, "Hong Kong", "Hong Kong", "Drawing");
        c.info();
    }
}
