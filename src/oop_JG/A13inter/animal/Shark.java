package oop_JG.A13inter.animal;

public class Shark implements Huntable, Violent{ //추가 하고 각각의 인터페이스가 제공하는 메서드 추가

//Huntable
    @Override
    public void hunt(Animal animal) {

    }
//Violent
    @Override
    public void angry() {

    }

    @Override
    public void fight() {

    }
}
