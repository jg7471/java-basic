package oop_JG.A11poly.car;

public class MainClass {


    public static void main(String[] args) {

        //클래스는 동일하지만 객체는 다름
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

        //직접적으로 호출 : 방법1
        //s1.run(); s2.run(); s3.run(); p1.run(); p2.run(); p3.run();
        //t1.run(); t2.run(); t3.run(); t4.run();

        //배열 : 동종 type 끼리만 가능(쏘나타, 포르쉐, 테슬라) : 방법2 : 3번 작성해야함,,
        /*
        Sonata[] sonatas = {s1, s2, s3}; //같은 쏘나타 객체
        for (Sonata s : sonatas) { //iter
            s.run();
        }
        */

        //방법 3 : 다형성을 적용해서 서로 다른 type들을 모아놓을 수 있다
        Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4}; //부모 Car의 배열에 다 집어 넣음 : 다형성
        for (Car c : cars) { //@@ Car c 여기서 선언된거? 같은 패키지내 전부 다 사용 가능?
            c.run();
        }

        System.out.println("------------------------------");
        Driver kim = new Driver();
        kim.drive(p1);
        //Driver public void drive (Car c) // 매개변수 부모타입으로 작성
        //c.run();
        // : 운전을 시작합니다 + Porsche : 포르쉐가 달립니다
        kim.drive(s2);
        kim.drive(t3);

        System.out.println("------------------------------");
        //Car myTesla = kim.buyCar("포르쉐");// 다형성 적용
        //myTesla.run();
        //myTesla.activeAutopilot(); //다형성의 한계 : myTeslad의 부모가 Car라서 : 부모가 알 수 없는 정보 : 자식이 확장한 개념

        //방법1
        //Tesla t = (Tesla) myTesla; //자식t 부모myTesla 강제 형변환
        //t.activeAutopilot();
        //부모타입 필요할 때

        System.out.println("------------------------------");
        //방법2// return new Tesla(); = Driver  Car 속성 같게 됨
        Tesla myTesla = (Tesla) kim.buyCar("테슬라");// @@@ 다형성 적용 //Car(부모)->(Tesla)(자식) 형변환
        //부모는 자식에게 모든걸 주지만, 자식은 아무 것도 줄 수 없음(부모는 자식이 변화 알 수 없음)
        myTesla.run();
        myTesla.activeAutopilot();
        System.out.println("------------------------------");




        CarShop shop = new CarShop();
        shop.carPrice(s2);
        shop.carPrice(t4);
        shop.carPrice(p1);


    }
}