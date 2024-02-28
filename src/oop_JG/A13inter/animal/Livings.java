package oop_JG.A13inter.animal;

//public class Livings implements Animal {
public abstract class Livings implements Animal {   //원랜 여기서 구상해야 하는데 Duck으로 전가

    /*
    인터페이스만으로는 아무 것도 할 수 없음
    인터페이스를 구현하는 클래스를 통해 명세된 내용을 구현

    인터페이스의 구현 키워드는 implements
    상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스의 이름을 씀

    인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서
    오버라이딩을 진행하던지, abstract 를 선언해서 자식에게 구현하도록 해야 함

    인터페이스는 하나의 클래스에서 여러 개의 인터페이스를
    동시에 다중 구현 할 수 있음, 또한 인터페이스들끼리 다중 상속도 가능
    */


    String name;
    int age;

    @Override
    public void feed(String foodName) {

    }

    @Override
    public boolean sleep() {
        return false;
    }
}
