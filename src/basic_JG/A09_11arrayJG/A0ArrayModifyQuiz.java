package basic.arrayJG;

import java.util.Arrays;
import java.util.Scanner;

public class A0ArrayModifyQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"}; //01234
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));


        while (true) {
            System.out.println("수정할 친구의 이름을 입력하세요");
            System.out.println(">>");
            String targetName = sc.next();

            //인덱스 탐색
            int index = -1; //인덱스가 -1이면 못찾은 것 : flag와 다른 방식
            for (int i = 0; i < kakao.length; i++) {
                if (targetName.equals(kakao[i])) {
                    //System.out.println(i); i값
                    index = i;
                    break;
                }
                /*
                else { //여기다 쓰면 여러번 반복(kakao.length 횟수만큼 되어 나옴
                    System.out.printf("%s는 없는 이름입니다\n", targetName);
                    continue;//안써도 됨
                }*/
            }
            //수정 여부 판단
            if (index != -1) {
                System.out.printf("%s의 이름을 변경합니다", targetName);
                System.out.println(">>");
                //String newName = sc.next(); //방법2
                kakao[index] = sc.next();//방법1
                //System.out.println("index number"+index);//index넘버 위에서 i값 물려받음
                //System.out.println("카카오넘버"+kakao[index]);//index값이 아닌 변경이름으로 출력됨

                // newName; //방법2 사용자가 작성한 newName
                System.out.println("변경완료");
                System.out.println("변경 후 정보" + Arrays.toString(kakao));
                break;

            //탐색실패
            } else {
                System.out.printf("%s는 없는 이름입니다\n", targetName);
                continue;//안써도 됨
            }
        }//end while
        sc.close();
    }//end main
}