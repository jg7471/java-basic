package oop_JG.A12abs;

public abstract class Pet { //이 아이는 추상클래스 입니다
    //오버라이딩 강제하려고 -> 상속이 필요하다


    // 공통 속성
    private String name;
    private String kind;
    private int age;

//생성자 alt insert 위에 속성 전부 클릭
    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    /*
     # 추상 클래스, 추상 메서드

     1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
      실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
      무조건 오버라이딩을 하도록 강요됩니다.

     2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
      메서드의 바디 ({})부분이 없고, 세미콜론으로 메서드 선언을 마감합니다.

     3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가
      하나라도 존재하는 경우에는 반드시 해당 클래스를 추상 클래스로 선언해야 합니다.
      //abstract class 선언


     4. 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다.
      일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
      일반 method 도 사용 가능
     */



    //공통 기능
    //낮잠 기능

    public abstract void takeNap(); //body 가 없는 method 사용가능해짐
    //추상 method body 미존재
    //틀만 만듦 -> 자식이 내용 꾸미기 : 객체 만들어라

    //식사 기능
    public abstract void eat(); //내용 없는 껍데기 method;
    // {} 제거됨

    //산책 기능
    public void walk(){}; // abstract 붙으면 무조건 override 해야함
    //산책을 못하는 동물을 위해 abstract 제거(금붕어)
    // {} 추가됨

    //인사 기능
    public final String sayHello() { //일반 메서드 //final : 자식에게 물려줄 수는 있으나 hello!! 변경 불가
        return "Hello!!" + this.name;
    }



}