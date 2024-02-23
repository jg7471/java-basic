package oop_JG.A2String;

import java.util.Scanner;

public class StringQuiz {
        /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.

         921013-1234567 -> 1992년 10월 13일 31세 남자
         031125-4123456 -> 2003년 11월 25일 21세 여자
         */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 13자리를 '-'을 포함해서 입력해주세요");
        while(true){
            System.out.println(">");
            String ssn = sc.next();

            if(ssn.indexOf("-") == -1) {
                System.out.println("'-'을 포함해서 입력하세요");
                continue;
            } else if(ssn.length() != 14){
                System.out.println("주민등록번호는 13자리 입니다.");
                continue;
            }
            ssn = ssn.replace("-","");
            char c = ssn.charAt(6);
            String str = ssn.substring(0,2);//0번부터 시작
            int year = Integer.parseInt(str); // 연도를 정수로 변환
            String month = ssn.substring(2,4);
            String day = ssn.substring(4,6);

            if(c == '1' || c == '2') { //c.equals 불가 ->기본타입 == 비교 가능(String 아님)
                year += 1900;
            } else {
                year += 2000;
            }

            int age = 2024 - year;
            String gender;
            if(c == '1' || c == '3'){
                gender = "남자";
            } else {
                gender = "여자";
            }
            System.out.printf("%d년 %s월 %s일 %d세 %s\n", year, month, day, age, gender);
            break;
        }

        /*//내가 작성
        Scanner sc = new Scanner(System.in);
        while (true) {
            String id = sc.next();
            int num = id.length();

            if (num != 14) {
                System.out.println("14자리로 다시 입력하세요");
            }

            if (num == 14) {
                char c = num.charAt(8);
                if (c == 1 || 3) {
                    System.out.println("남성입니다");
                } else if (c == 2 || 4) {
                    System.out.println("여성입니다");
                }
                //-위치
                //19+20 더하기
                String year = id.substring(1, 3);
                int i = Integer.parseInt(year);
                int age = 2024 - i;
                String month = id.substring(3, 5);
                String day = id.substring(5, 7);
                //남녀 추출 != if
            }
        }
        printf("%d년 %d월 %d일 %d세", year, month, day, age);
        */
    }
}