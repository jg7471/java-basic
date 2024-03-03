package oop_JG.A11poly.car;



public class Driver {


        public void drive (Car c){ // 매개변수 부모타입으로 작성 : 매개변수의 다형성 : 부모 사용 //@@@extends 없는데 가능?
            System.out.println("운전을 시작합니다");
            c.run();
        }


        /*
        public Sonata buySonata(){ //자바의 메서드 리턴 타입 존재 : sonata
            System.out.println("소나타 구입합니다");
            return new Sonata();//무조건 return : sonata
        }
        */

    public Car buyCar(String name){ // return 타입 다형성 car(부모) 적용 :
        if(name.equals("쏘나타")){
            System.out.println("쏘나타 구입합니다");
            return new Sonata();
        } else if(name.equals("포르쉐")) {
            System.out.println("포르쉐 구입합니다");
            return new Porsche();
        } else if(name.equals("테슬라")) {
            System.out.println("테슬라 구입합니다");
            return new Tesla();
        } else {
            System.out.println("뭐 달라고~");
            return null;
        }
    }

//요거 연습해봐야함
        //각각 메서드 선언
//    public void drive(Sonata s){ //메서드 선언 : Sonata
//        s.run();
//    }
//    public void drive(Tesla t){ //오버로딩
//        t.run();
//    }
//    public void drive(Porsche p){ // 3번 반복: 비효율적
//        p.run();
//    }

    }
