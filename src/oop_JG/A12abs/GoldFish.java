package oop_JG.A12abs;

public class GoldFish extends Pet{
    public GoldFish(String name, String kind, int age) { //alt insert
        super(name, kind, age);
    }

    @Override //ctrl O,,,강제
    public void takeNap() {
        System.out.println("금붕어는 어항에서 눈뜨고 자요");

    }

    @Override//강제
    public void eat() {
        System.out.println("금붕어는 어류용 사료를 뻐끔뻐금");

    }

    //walk는 오버라이딩 안함 : 불안정 메서드로 남겨둠
}
