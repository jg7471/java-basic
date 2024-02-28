package oop_JG.A13inter.animal;

public class Duck extends Livings { // livings 상속
    @Override
    public void feed(String foodName) {
        System.out.println("오리가" + foodName + "을 먹어요");
    }

    @Override
    public boolean sleep() {
        return false;
    }
}
