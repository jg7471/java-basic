//package oop_JG.A11poly.basic;
//
//
///*
//- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
// 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
//- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
// 해당 클래스만 public으로 선언할 수 있습니다.
//*/
//
//class A{} //클래스 즉석 선언
//class B extends A{}
//class C extends A{}
//class D extends B{} //D와 E도 A의 자식 - 상속관계는 이어짐, 일방적 관계 부모 -> 자식 줄수만 있다
//class E extends C {}
//// B - C 수평관계 X
//// 부모는 오직 한명만 가능(다중 상속X : C++가능
//
////1,상속관꼐 연곌될 수 있다 ABC
////2, 일방적 관계 (부->모)
////3. 수평적 관게X (형제X)남임
////4. ?? 2교시 @@@ 마지막 강의
////5. 오브젝트 최상위
//
//// object : 결국 모두 object의 자식 (자바의 최상위)
//
///*
//  A
// /  \
//B   C
//ㅣ  ㅣ
//D   E
//*/
//
//public class Baisc {
//
//    A a = new A();
//    B b = new B();
//    C c = new C();
//    D d = new D();
//    E e = new E();
//
//    /*
//    다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을 의미
//    장점 : 타입의 규격화
//
//    즉 부모 타입의 변수에 자식 객체의 주소값을 얼마든지 저장할 수 있음
//    */
//
//    //int i = 5;
//    //double d2 = i; //double 상위타입이라 올려 받음
//
//    A v1 = new B(); //부모 -> 자식 : 클래식 타입 B -> A타입으로 자동 형 변환(promotion)
//    A v2 = new C(); //자식이 부모 객체 물려받음
//    A v3 = new D();
//    A v4 = new E();
//
//    B v6 = new D();
//    C v7 = new E();
//    //상속 관계가 없다면 다형성 적용이 불가능
//    //즉, 다형성은 무조건 상속 관계 하에서만 발생
//
//    // B v8 = new C(); //수평관계 X
//    // C v9 = new D(); //조카관계X
//    // B v10 = new E() //X
//    // D v11 = new E() //X
//
//    //object는 자바의 최상위 클래스, 모든 객체는 object의 자식
//    //object 타입의 변수에는 어떠한 객체도 들어 올 수 있음.
//    Object o1 = new A(); //Object 입력시.. java.lang // import 노필요
//    Object o2 = new B();
//    Object o3 = new C();
//    Object o4 = new D();
//    Object o5 = new E();
//    Object o6 = new String("HALOU");
//    Object o7 = new Basic();
//
//
//}