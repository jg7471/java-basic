//package arrayJG;
//
//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Gaije {
//
//    public static void main(String[] args) {
//        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
//        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
//
//        Scanner sc = new Scanner();
//        while (true)
//            System.out.println("수정할 친구의 이름을 입력하세요");
//        System.out.println(">>");
//        String targetName = sc.next();
//
//        //인덱스 탐색
//        int index = -1; //인덱스가 -1이면 못찾은 것 : flag와 다른 방식
//        for (int i = 0; i < kakao.length; i++) {
//            if (targetName.equals((kakao[i]))) {
//                index = i;
//                break;
//            }
//        }
//        //수정 여부 판단
//        if (index != -1) {
//            System.out.printf("%s의 이름을 변경합니다", targetName);
//            System.out.println(">>");
//            //String newName = sc.next(); //방법2
//            kakao[index] = sc.next();//방법1 //newName; //방법2 사용자가 작성한 newName
//            System.out.println("변경완료");
//            System.out.println("변경 후 정보"+Arrays.toString(kakao));
//            break;
//
//        } else {
//            System.out.printf("%s는 없는 이름입니다\n", targetName);
//            continue;//안써도 됨
//        }
//    }//end while
//}//end main
