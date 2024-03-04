package etc.api.collection.list;

import oop_JG.A06modi.member.pac1.A;
import util.Utility;

import java.util.ArrayList;
import java.util.List;

import static util.Utility.*;

public class ArrayListExample {

    public static void main(String[] args) {
        //인강 천천히
        //짹짹이 빼먹음


        /*
         # ArrayList
         - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
         - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
         - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
         */

    //String[] nick = new String[50]; //기존 배열 방식

    // <> -> 제네릭(타입의 형식을 지정하여, 타입 안정성을 꾀하기 위한 문법) //뒤 <> 타입 생략(String) 가능
    //ArrayList<String> nick = new ArrayList<>(); //import 추가 필요 //object 타입으로 -> 형변환 필요 //타입이 다르면 배열 다르게
    List<String> nick = new ArrayList<>(); //보통 인터페이스 타입으로 변수 선언 많이 함 //객체임 : 접근 하기 위해 메서드로


    String str = "야옹이"; //변서 선언 야옹이

    // add(객체): 리스트에 객체를 추가하는 메서드
    nick.add(str);
    nick.add("멍멍이");
    nick.add(new String("개구리"));
    nick.add("야옹이");// 그냥 추가(중복 허용 중복되더라도 인덱스로 구분)
    System.out.println(nick); //바로 확인 가능

    //List nick = new ArrayList(); //String 타입 세팅 안하면 object 타입 -> 꺼낼되 일일히 형변환해야함
    //object o = nick.get(2);
    //((String)o).length();

    //add(인덱스, 객체): 특정 인덱스에 객체를 삽입하는 메서드
    nick.add(3,"어흥이"); //0123
    System.out.println(nick);

    //단순참조 배열이 더 빠름 //메서드는 기능 다양
    //get(인덱스) : 리스트 내부의 객체를 참조하는 메서드
        //String name = nick[3]; //X 배열의 방법
        String name = nick.get(3);
        System.out.println("3번 인덱스의 값 = " + name);
        System.out.println("name.length() = " + name.length());//텍스트 길이

        //size(): 리스트의 크기 반환
        System.out.println("nick의 크기: " + nick.size()); //12345

        //set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
        nick.set(2, "삐약이");
        System.out.println(nick); //0123

        //remove(인덱스), remove(객체)
        nick.remove(5);
        System.out.println(nick);
        nick.remove(str);
        System.out.println(nick);

        //리스트의 반복문 처리
        for(int i = 0; i < nick.size(); i++){
            System.out.println(nick.get(i));

        }

        makeLine();

        //향상 for문(forEach) //전체조회
        for (String s : nick) {
            System.out.println(s);
        }

    }
}