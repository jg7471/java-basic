package oop_JG.A11poly.casting;


public class MainClass {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.n1 = 1;
        //p.n2 = 2; //Child 사용불가

        p.method1();
        p.method2();
        //p.method3(); //parent에 없음 : 자식에 있음

        System.out.println("=================================================");

        Child c = new Child(); //child 객체 접근 가능
        c.n1 = 1; // 부모에게 물려받은 속성
        c.n2 = 2; // 자기 고유속성

        c.method1(); //부모값
        c.method2(); //고친 값 나옴 : 부모껀데, 자식이 재정의 한게 우선적으로 나옴
        c.method3(); //원래 본인이 갖고 있던 값

        System.out.println("=================================================");

        //다형성 적용
        Parent p2 = new Child();
        p2.n1 = 1;
        //p2.n2 = 2; //X 부모는 자식꺼 참조X

        p2.method1();
        p2.method2();
        //p2.method3(); //Child 임에도 사용불가 : Parent 타입 : p2 으로 객체에 접근한다 -> 부모인 상태로 자식에게 접근한다 XX
        //n1은 갖고 있던거지만(자식이 수정했더라도), p2에서 child 접근 불가

        //부모의 시선으로는 자식이 뭘 수정했는지 모르니 : 자식의 객체를 만들어 자식의 눈으로 보아라 :
        // 오브젝트 : 담기는 하나, 호출 불가(차일드에서 변화 감지 못함) - 자기가 물려준 것만 사용가능(변화된 것 사용불가)


        /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다)

         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */


        Child c2 = (Child)p2;//객체 생성 아님(주소값 같다 : 부모타입을 이용해서 접근 한 것뿐)
        //부모 타입을 자식 타입으로 강제 변환(DownCasting)
        //p2주소 c2로 옮기라 : 상위p2부모 -> 하위c2자식
        c2.n2 = 2;
        c2.method3();
        //객체가 2개 생성된 것이 아니라, 하나의 객체의 접근 방식을 두가지로 늘린 것
        System.out.println("p2 = " + p2);
        System.out.println("c2 = " + c2);

        //object 타입의 변수는 어떠한 객체든 담을 수 있지만, 객체 고유의 기능을 사용하기 위해서는
        //형 변환이 거의 항상 필요함 -> Object가 물려주는 메서드 자체가 별로 없음(상징적 클래스)
        Object obj = new String("안녕하세요");
        String str = (String)obj; //상->하 형변환 필요
        System.out.println("문자열의 길이 " + str.length()); // indexOf subString charAt : object는 자식이 얼마나 같고 있는지 모름

        //다형성이 한 번도 발생하지 않은 경우에는 강제 형 변환을 사용할 수 없음
        Parent ppp = new Parent(); //부모객체 ppp -> 형변환ppp-> 자식ccc XXX
        //Child ccc = (Child)ppp; //에러

    }
}