package util;

import java.util.Scanner;

public class Utility {

    public static final String FILE_PATH = "C:\\Users\\ICT4_15\\Desktop\\file\\music"; //상수(static final)로 설정

    static Scanner sc; //정적초기화아자 스캐너 + 라인

    static {
        sc = new Scanner(System.in);
    }

    //입력창의 구분을 위해 줄을 그어주는 메서드
    public static void makeLine(){
        System.out.println("================================================");
    }
    //@@등록 호출 단축키

    //문자열을 입력받는 기능
    public static String input(String message){
        System.out.print(message);
        return sc.nextLine(); //공백포함 되어 있을 수도 있으니

    }
}
