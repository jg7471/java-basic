package etc.Z4enum;

import util.Utility;

import java.sql.SQLOutput;

import static util.Utility.*;

public class MainClass {
    public static void main(String[] args) {

        Developer kim = new Developer();
        kim.name = "김춘식";
        kim.career = 3;
        kim.lang = Language.JAVA; //enum으로 범위로 한정


        Developer hong = new Developer();
        hong.name = "홍길동";
        hong.career = 10;
        hong.lang = Language.PYTHON;


        Developer park = new Developer();
        park.name = "박상성";
        park.career = 7;
        park.lang = Language.PYTHON;

        System.out.println("kim의 주력언어" + kim.lang);
        System.out.println("hong의 주력언어" + hong.lang.getName()); // 숨겨진 값 호출
        System.out.println("hong의 주력 언어는 컴파일 언어인가?: " + hong.lang.isCompileLang());
        System.out.println("park의 주력언어" + park.lang.getName());

        makeLine();
        //values(): 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴.
        Language[] values = Language.values();
        for (Language lang : values) {
            System.out.println(lang);
        }

        //ordinal(): 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴
        System.out.println(park.lang.ordinal()); // park의 언어 python 1번 index 01234 //DB 에서 사용됨 : enum 타입은 DB 에서 지원이 안되어서
        //valueOf("str"):매개값으로 전달된 문자열과 일치하는 요소를 리턴.
        System.out.println(Language.valueOf("CPP"));
        //System.out.println(Language.valueOf("MERONG")); //에러 발생

    }
}