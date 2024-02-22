//package basic.arrayJG;
//
//import java.util.Scanner;
//
//public class NewPractice1 {
//    public static void main(String[] args) {
//
//
//
//        /*
//         1. String 배열을 생성하세요. (foods)
//         크기는 넉넉하게 50개로 지정하겠습니다.
//
//         2. 사용자에게 음식 이름을 입력받아서 배열에
//          삽입해 주세요.
//          사용자가 음식 입력창에 '배불러' 라고 작성하면
//          입력을 종료해 주세요.
//
//         3. 입력이 종료되면 사용자가 입력한 음식을
//         가로로 출력해 주세요. (null은 출력하지 마세요.)
//
//          추가 문제
//        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
//        '이미 존재하는 음식입니다.' 를 출력하고
//        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
//        */
//
//        Scanner sc = new Scanner(System.in);
//        //String[50] foods;
//        String[] foods =new String[50];
//
//        System.out.println("음식값 입력 or 그만");
//        outer : for(int i = 0; i <= foods.length; i++){
//            //String foods = sc.next();
//            String name = sc.next();
//
//            if(name.equals("그만")){ //foods 잘못 적음
//                break;
//            }
//
//            for(String f : foods){
//                if(f==null) {
//                    break;
//                }
//                if (name.equals(f)){
//                    System.out.println("이미 존재하는 음식입니다");
//                    i--;
//                    continue outer;
//                }
//            }
//            //빼먹음
//            foods[i] = name;
//            //System.out.println("결과"+Array.toString[foods]);
//
//        }
//        System.out.println("결과"+Array.toString[foods]);
//
//    }
//}
