package oop_JG.A13inter.animal;

public class BullDog extends Livings implements Violent, Huntable{//상속도 받으면서 인터페이스

    //animal 메소드 오버라이딩
    @Override
    public void feed(String foodName) {
        System.out.println("불독이"+foodName+"을 먹어요");
    }

    @Override
    public boolean sleep() {
        return false;
    }


    //Violent 메서드 오버라이딩
    @Override
    public void angry() {
        System.out.println("불독이 화를 내요!");
    }

    @Override
    public void fight() {
        System.out.println("불독이 싸움을 거네요!");
    }

    //Huntable 메소드 오버라이딩
    @Override
    public void hunt(Animal animal) {
        System.out.println("불독이 사냥을 해여");
    }

}
