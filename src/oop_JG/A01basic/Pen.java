
package oop_JG.A01basic;

//객체 설계용 클래스(라이브러리 클래스)는 main를 작성하지 않습니다
public class Pen {

    // 객체의 속성을 필드(멤버변수)라고 부름
    String color;
    int price;

    //객체의 기능을 표현한 함수를 메서드라고 합니다.
    void write(){
        System.out.println(color + "색 글 씁니다.");
    }

    void priceInfo(){
        System.out.println(color + "섹 펜의 가격은" + price + "원 입니다");
    }


}