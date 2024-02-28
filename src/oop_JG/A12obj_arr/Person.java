package oop_JG.A12obj_arr;

public class Person {

    //private 직접 붙이고 1 //@@ 여기 왜 private? 요게 정석?->ㅇㅇ 보안
    private String name;
    private int age;
    private String gender;

    //생성자 생성 alt insert
    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    //alt insert : 전체선택 후 getter 및 setter 자동으로됨 2
    //@getter @setter 나중에는 이렇게 해도됨+@
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void personInfo(){
        System.out.printf("이름: %s\n나이: %s\n 성별: %s\n",
                this.name, this.age, this.gender);
        System.out.println("---------------------------------------");

    }


}