package oop_JG.A03constructor;

public class Customer {

    String name;
    int age;
    String hometown;

    Customer(){}

    public  Customer(String name, String hometown){
        this.name = name;
        this.age = 20040501;
        this.hometown = hometown;
    }

    void hello(){
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("hometown :" + hometown);
    }


}
