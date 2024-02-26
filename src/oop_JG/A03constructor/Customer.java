package oop_JG.A03constructor;

public class Customer {
    String name;
    int age;
    String city;
    String nationality;
    String hobby;

    Customer() {
    }

    public Customer(String name,
                    int age,
                    String city,
                    String nationality,
                    String hobby) {

        this.name = name;
        this.age = age;
        this.city = city;
        this.nationality = nationality;
        this.hobby = hobby;
    }

    void info(){
        System.out.println("-----GF Data-----");
        System.out.print("이름"+name+", 나이"+age+", 도시, "+city+", 국적"+nationality+", 취미"+hobby);

    }

}
