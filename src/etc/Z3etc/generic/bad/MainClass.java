package etc.Z3etc.generic.bad;

import etc.Z3etc.generic.basic.Box;
import etc.Z3etc.generic.basic.Person;

public class MainClass {

    public static void main(String[] args) {

         /*
         Object타입으로 선언하면 무엇이든 저장할 수는 있지만
         반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는
         문제가 발생합니다.
         잘못 형 변환 했을 시에는 예외가 발생할 수도 있습니다.
         */
        //제네릭 선언하면 오브젝트됨 :선언은 쉬우나 :돌려받을 때 어렵다


        Box box = new Box();
        box.setObj(new String("김춘식")); //어떠한 box 다 넣을 수 있다 obj
        // 매개변수 타입이 Object : 어떠한 타입이든 객체 전달 가능
        //박스에 스트링 집어 넣음(다형성)

        System.out.println(((String) box.getObj()).charAt(0)); //getObj 리턴타입이 OBJ. 넣어둔 객체는 String // OBJ는 charat가 뭔지 모름
        //부모의 눈으로 자식 활용 불가-> 형변환 필요
        // box.getObj() 리턴값 1개
        //String vs .charAt = .chatAt이 더빠름
        //돌려받을 때 오브젝트라 직접 받기 어려움


        Box p = new Box();
        p.setObj(new Person()); //Person도 Obj의 자식-> 전달 가능 //세팅은 잘됨
        String name = ((Person)p.getObj()).getName();//person 객체는 Obj타입이라 바로 조회X->Person 타입으로 낮춤->괄호 한번 더 싀어줌(getname이 더 빠르니까??)-> String name으로 받음
        //돌려받을 때는 person 타입으로 낮춤


    }
}
