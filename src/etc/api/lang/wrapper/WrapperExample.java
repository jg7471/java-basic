package etc.api.lang.wrapper;

import oop_JG.A06modi.cls.pac1.B;

import java.io.CharConversionException;

public class WrapperExample {
    public static void main(String[] args) {

        int a = 100;
        boolean b = false;
        char c = 'A';
        double d = 3.14;

        //Integer v1 = new Integer(a); 옛날 문법 // boxing: 기본 데이터 타입을 객체 타입으로 변환하는과정 -> deprecated 도태된 문법
        //Boolean v2 = new Boolean(b); //자바 8버젼까지 사용됨

        //unboxing : 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정
        // int i = v1.intValue(); -> deprecated

        //auto boxing: 기본 타입을 자동으로 객체형으로 변환
        Integer v1 = a;
        Boolean v2 = false;
        Character v3 = c;
        Double v4 = d;

        //auto unboxing: 객체 포장을 기본형으로 자동 해제 가능
        int i = v1;
        double b2 = v4;

        // Autoboxing 이후에 wrapper 클래스는 문자열을 기본형으로 변환하는데 많이 사용함.
        int i1 = Integer.parseInt("351"); //문자 351을 실수형으로
        double d3 = Double.parseDouble("3.14");

        // 해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
        // NumberFormatException 예외 발생
        Integer.parseInt("23.45"); //double 타입



    }
}