package util;

import java.util.Scanner;

public class Utility {

    public static final String FILE_PATH = "C:\\Users\\ICT4_15\\Desktop\\file\\music"; //상수(static final)로 폴더 저장위치 설정


    static {
        sc = new Scanner(System.in);
    }

    //입력창의 구분을 위해 줄을 그어주는 메서드
    public static void makeLine(){
        System.out.println("================================================");
    }
    //@@등록 호출 단축키

    //문자열을 입력받는 기능
    static Scanner sc; //정적초기화아자 스캐너 + 라인 //1) static으로 Scanner 선언 @@
    public static String input(String message){ //2) 메소드 String input() 매개변수 message
        System.out.print(message); //3)(필드에서) input(); 선언시 message 출력됨과 동시
        return sc.nextLine(); //공백포함 되어 있을 수도 있으니 //4) return값으로 sc.nextLine() <- 데이터 입력값 받음
    }

    public static int numInput(int num){
        System.out.print(num);
        return sc.nextInt(); //nextInt로 수정
    }




}
