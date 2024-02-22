package basic_JG.arrayJG;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {
    public static void main(String[] args) {

        /*
         1. String 배열을 생성하세요. (foods)
         크기는 넉넉하게 50개로 지정하겠습니다.
         */
        Scanner sc = new Scanner(System.in);
        String[] foods = new String[50];


        /*
         2. 사용자에게 음식 이름을 입력받아서 배열에
          삽입해 주세요.
          사용자가 음식 입력창에 '배불러' 라고 작성하면
          입력을 종료해 주세요.
        */

        System.out.println("먹고픈 음식을 말하세요, \n 그만 먹고프면 '배불렁'이라고 말하세요");
        outer: for (int i = 0; i < foods.length; i++) {
            String name = sc.next();

            if (name.equals("배불렁")) {
                System.out.println("그만 먹어");
                break;
            }

        /*
         3. 입력이 종료되면 사용자가 입력한 음식을
         가로로 출력해 주세요. (null은 출력하지 마세요.)
         */

            for (String f : foods) { //중복검사
                if (f == null) break; //null이 들어오면 위 반복문 종료

                if (name.equals(f)) { //중복 발생
                    System.out.println("이미 존재하는 음식이야~");
                    //우리의 의도는 이번 회차가 무효인거지, 건너 뛰려는 것이 아니기에
                    //미리 제어변수 i의 값을 하나 감소(최상단 i++)
                    i--; //for문에서 continue는 증감식이 동작 //제어변수 값 그대로 받아야 하기 위해
                    continue outer; // outer에서 작동하는 continue
                }
            }
            foods[i] = name; //이름 넣기


        }

        System.out.println(Arrays.toString(foods));
        System.out.println("--------------------------------------------");
        System.out.print("내가 먹고 싶은 음식들: ");

        for (String f : foods) {
            if (f == null) break; //null은 비교 가능 //문자열은 equals 사용 비교가능
            System.out.print(f + " "); //가로 출력
        }

        sc.close();
        /*
          추가 문제
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        */

        //includes(values) //자바스크립트 style


    }
}
