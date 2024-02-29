package oop_JG.A13inter.animal;

import oop_JG.A06modi.member.pac1.B;

public class MainClass {

    public static void main(String[] args) {

        //Animal a = new Animal(); // X 인터페이스 자체만으로 객체생성 불가 , 생성자 불가
        /*
        다형성은 상속이 전제되어야 하는 것이 원칙이지만
        예외로 인터페이스와 클래스 간의 구현 관계에서도
        다형성 발생을 허용
        */


        //Duck duck = new Duck(); //OK
        Animal duck = new Duck();
        Huntable bullDog = new BullDog();
        Violent shark = new Shark();
        BadAnimal bear = new Bear(); //다양한 인터페이스 적용 가능

         /*
         - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
          정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.

         - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
          구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
         */

        ((Animal)bear).feed("과일"); //badanimal->animal 즉석 형변환 가능
        //bear -> animal 변경 후 -> feed 를 불러와라
        //bear type -> BadAnimal -> feed()에 대한 정보 X ->Animal 타입으로 즉시 형변환 가능
        // -> Bear 클레스가 결국 Animal과 연관이 있기 때문에...! : @@ 직접 그려보셈
        // 인터페이스는 형변환이 유연하다 즉시즉시 형변환 가능: 연결만 되어있으면 인터페이스끼리 형변환 가능

        Animal[] animals = {duck, (Animal) bullDog, (Animal) shark, (Animal) bear};
        //Animal - Livings 상위 인터페이스
        //인터페이스 연결만 되어있으면 직속 외 어디든 형변환 가능



    }

}
