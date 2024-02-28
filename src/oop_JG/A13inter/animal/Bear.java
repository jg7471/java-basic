package oop_JG.A13inter.animal;

public class Bear extends Livings implements /*Violent, Huntable = 합쳐서 퉁침 */ BadAnimal{
    //클래스 생성시 인터페이스로 간단히 메서드 추가 가능(틀 역할)
    @Override
    public void hunt(Animal animal) {

    }

    @Override
    public void angry() {

    }

    @Override
    public void fight() {

    }
}
