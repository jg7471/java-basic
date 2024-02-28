package oop_JG.A09static_.singleton;

public class Singleton { //public???


    //객체 생성을 단 1개로 제한하기 위한 디자인 패턴 : 남용 방지

    /*
    싱글톤 디자인 패턴 : 클래스의 객체를 단 1개로 제한하기 위한 코드 디자인 패턴
    무분별한 객체의 생성을 막고, 하나의 객체를 여러 번 재활용하기 위한 목적

    1. 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만 선언하고,
    private 접근 제한을 붙임.
    */

    private Singleton() { //private 여기서만 생성됨 //Singleton private로 가림
        System.out.println("객체가 생성됨");
    }

    //2. 생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로
    //자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성함
    private static Singleton s = new Singleton(); //private 이므로 외부에서 사용불가 //static 추가하여 공용으로 만듦
    //객체도 new 싱글톤으로 선언
    //외부에서 접근 하지 못하도록 private 추가 ->s로 바로 접근 불가->getInstace()로만 접근 가능


    // 3. 외부에서 이 클래스의 객체를 요구할 시, 2번에서 미리 만들어 놓은
    // 단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴
    public static Singleton getInstance(){ //singleton 사용시 method 명 관례 //내가 만들었으니 이거 써
        //static 을 추가함므로 getInstance() method 객체로 호출 가능
        return s;
    }

    //////////////////////////////////////////////////////////////

    public void method1(){
        System.out.println("여러 군데에서 쓰이는 중요한 메서드");
    }

    public void method2(){
        System.out.println("프로그램 내에서 꼭 한번 불어야 하는 귀중한 메서드");
    }


}
