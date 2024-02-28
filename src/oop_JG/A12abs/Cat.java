package oop_JG.A12abs;

public class Cat extends Pet{
    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override//강제
    public void takeNap() {
        System.out.println("고양이는 캣타워에 널부렁");
    }

    @Override//(강제
    public void eat() {
        System.out.println("고양이는 생선을 냠냠냠");
    }

    //ctrl O
    @Override //선택하는 것(강제 X)
    public void walk() {
        System.out.println("집에서 뒹굴뒹귈");
    }
}
