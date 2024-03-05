package etc.api.collection.Y4map;

import java.util.*;

public class ZPractice {

    public static void main(String[] args) {

        //단어입력 검사 한글 등록 등록확인(추출)

        Scanner sc = new Scanner(System.in);
        Map<String, String> engKor = new HashMap<>();

        while(true){
            System.out.println("단어 입력");
            String eng = sc.next();

            if(eng.equals("그만")){
                System.out.println("종료");
                break;
            } else if(engKor.containsKey(eng)){
                System.out.println("중복값");
                break;
            }
            System.out.println("한글값 입력");
            String kor = sc.next();
            engKor.put(eng,kor);


            for (String s : engKor.keySet()) {
                System.out.printf("결과\n"+s + engKor.get(s));

            }

        }




    }
}
