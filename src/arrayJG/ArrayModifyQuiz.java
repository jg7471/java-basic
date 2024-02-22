//package arrayJG;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayModifyQuiz {
//    public static void main(String[] args) {
////        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
////        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
////        Scanner sc = new Scanner(System.in);
//
//        boolean flag = false;
//        // 1. 수정 타겟의 이름을 입력받는다.
//
//        // 2. 해당 이름이 있는지 탐색해본다.
//        for (int i = 0; i <= kakao.length; i++) {
//            String name = sc.next();
//
//            for (String n : kakao) {
//                if (name.equals(n)) {
//                    System.out.printf("%s 찾았습니다", kakao[i]);
//                    System.out.println("값을 변경하겠습니까?or그만" + Arrays.toString(kakao));
//
//                    String change = sc.next();
//                    if (change.equals(n) && change.equal("그만")) {
//                        kakao[i] = change;
//                    }
//                }
//                {
//                    if (n == null)
//                        System.out.println("값을 찾지 못했습니다 : " +n);
//                    break;
//                }
//
//            }
//            System.out.println("결과는"+Arrays.toString(kakao));
//
//        }
//
//
//        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
//        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
//        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
//        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
//        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.
//
//        sc.close();
//
//    }
//}
