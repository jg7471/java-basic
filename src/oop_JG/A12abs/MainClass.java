package oop_JG.A12abs;

public class MainClass {

    public static void main(String[] args) {

        /*
         - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
          프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
          메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
          구현하기가 편합니다.

         - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
         */

        //추상클래스는 스스로의 객체 생성 불가
        //하지만 추상클래스는 객체가 아예 생성이 안되는 것이 아니라
        //자식 객체를 통해 실체화가 가능(super()) -> 부모에선 대충선언 ->자식에게 짬시킴

        //Pet p = new Pet("애완견","몰라",3); //추상클래스 스스로 객체 생성 불가
        //추상클래스는 미완성 : 스스로 불가 :자식에 의해서 생성되야함

       Pet dog = new Dog("뽀삐","푸들",3); //객체 생성 : 생성자 각 1개뿐
       Cat cat = new Cat("꾸끼","코숏",2);
       GoldFish fish = new GoldFish("잉어킹","잉어",1);

       Pet[] pets = { //추상클래스 Pet 다형성
               dog, cat, fish
       };

       for(Pet pet : pets){
           pet.takeNap();
           pet.eat();
           pet.walk();
           System.out.println(pet.sayHello());
       }

    }
}
