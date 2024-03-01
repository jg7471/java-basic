package basic_JG.A06constate;

import java.util.Arrays;
import java.util.Scanner;

public class myPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] foods = new String[50];

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

         for(String f : foods){
             if(f == null) break;

             if(name.equals(f)){
                 System.out.println("이미 존재하는 음식");
                 i--;
                 continue outer;
             }
         }





        }

        System.out.println(Arrays.toString(foods));
        System.out.println("--------------------------------------------");
        System.out.print("내가 먹고 싶은 음식들: ");

        for (String f : foods) {
            if (f == null) break; //null은 비교 가능 //문자열은 equals 사용 비교가능
            System.out.print(f + " "); //가로 출력
        }

        sc.close();

    }
}