package oop_JG.A11poly.car;

public class CarShop {

    /*
     - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
      객체인지를 검사할 때 사용하는 연산자 입니다.

     - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
      있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
    */
    public void carPrice(Car c) {//포르쉐 테슬라 쏘나타
        if (c instanceof Sonata) {
            System.out.println("쏘나타의 가격은 3000만원 입니다");
        } else if (c instanceof Tesla) { //c != Tesla : 타입을 갖을 수 있는가? 좌항의 객체가 우항의 타입을 갖을 수 있는가?
            System.out.println("테슬라의 가격은 8000만원 입니다");
        } else if (c instanceof Porsche) {
            System.out.println("쏘나타의 가격은 20000만원 입니다");
        }
    }
}
