package basic_JG.A06constate;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요(cm)");
        int height = sc.nextInt();
        if(height >= 140){
            System.out.println("나이를 입력하세요");
            int age = sc.nextInt();
            if(age >= 8){
                System.out.println("탑승가능");
            }else if(age >= 6){
                System.out.println("보호자필요");
            }else{
                System.out.println("6세 미만 탑승불가");
            }

        }else{
            System.out.println("키가 140cm 미만 입니다.");
            System.out.println("탑승불가.");
        }

        System.out.println("age"); //if문도 블록이라 지역변수
        //변수는 선언된 블록 내에서만 유효
        System.out.println("height");//main내에서 사용 : 호출 가능
        sc.close();
    }
}
