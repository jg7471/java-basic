//package basic_JG.arrayJG;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class A2ArrayDeleteQuiz {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
//        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
//
//        while (true) {
//            if(kakao.length == 0){// 위치 : kakao = temp; temp = null 로 옮겨도 됨;
//                System.out.println("더 이상 삭제할 친구가 없네요");
//                System.out.println("프로그램을 종료합니다");
//                break;
//            }
//
//            System.out.println("삭제할 친구의 이름을 입력하세요");
//            System.out.println(">>");
//            String targetName = sc.next();
//
//            //인덱스 탐색
//            int index = -1; //-1이면 없는 이름 호출한 것
//            for(int i = 0; i < kakao.length; i++){
//                if(targetName.equals(kakao[i])){
//                    index = i;
//                    break;
//                }
//            }
//            // 삭제 여부 확인 //{"무지", "네오", "어피치", "라이언", "춘식이"}; 01234
//            if(index != -1){ //ex 어피치[2]
//                System.out.println(kakao[index]+"의 이름을 삭제합니다"); //ex 어피치
//                //System.out.println("index : "+index);//ex 2
//
//                //삭제 알고라줌
//                for(int i = index; i < kakao.length-1; i++){ //마지막 요소 빼기 위해
//                    kakao[i] = kakao[i+1]; // 덮어 씌움
//                    //System.out.println("index in for"+index);//ex 2
//                    //System.out.println("kakao : "+Arrays.toString(kakao));//ex [무지, 네오, <라이언>, 라이언, 춘식이]
//                }
//                String[] temp = new String[kakao.length-1];
//                //System.out.println("temp : "+Arrays.toString(temp));//[null, null, null, null]
//
//
//                for(int i = 0; i < temp.length; i++){
//                    temp[i] = kakao[i];
//
//                }
//                kakao = temp; temp = null;
//
//
//                System.out.println("$ 삭제 후 정보 : " + Arrays.toString(kakao));
//
//            }else {
//                System.out.printf("해당 이름(%s)은 존재하지 않습니다\n", targetName);
//            }
//        }
//
//        sc.close();