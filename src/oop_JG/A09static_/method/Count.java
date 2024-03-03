package oop_JG.A09static_.method;

public class Count {
    public int a; //인스턴스 변수
    public static int b; //정적 변수

    /*
    #인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
    인스턴스 메서드 안에서는 정적(static) 변수와 인스턴스 변수를 모두 사용할 수 있음
    */

    public int method1(){
        return this.a + Count.b;
    } //static b //선언만 한거 -> main에 객체 생성해야 호출 필요 1번


    /*
    Static 블록(메서드. 정적 초기화자) 내부에서는 static이 붙은 변수나 메서드만 사용가능
    this는 사용 불가 -> 나타낼 주소값이 없기 때문 -> 객체 생성 없이도 호출 가능(static)

    static 블록 내부에서 non-static 멤버를 참조하려면 반드시 주소값을 통해 참조해야함(3번)
    */

    public static int method2(){ //객체 생성해서 호출X //1번에 비해 2번 static 적혀있음
        //2번 static에서 this 사용 불가
        Count ccc = new Count();//(3번) static 블록 안에서 this를 참조하려면 객체를 만들어야함
        return ccc.a + Count.b; //객체 생성 후 요렇게 호출

        //return this.a + Count.b; //this = 객체가 없으니 static method에서 호출 불가
        // 누구의 a? : static은 객체 없이도 사용가능

    }


}
