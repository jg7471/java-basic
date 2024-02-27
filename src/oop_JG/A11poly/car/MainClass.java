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
        for (Car c : cars) {
            c.run();
        }

        System.out.println("------------------------------");
        Driver kim = new Driver();
        kim.drive(p1);
        kim.drive(s2);
        kim.drive(t3);

        System.out.println("------------------------------");
        Car myTesla = kim.buyCar("포르쉐");// 다형성 적용
        myTesla.run();
        //myTesla.activeAutopilot(); //다형성의 한계 : myTeslad의 부모가 Car라서 : 부모가 알 수 없는 정보 : 자식이 확장한 개념





    }
}