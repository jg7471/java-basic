package oop_JG.A12obj_arr;

import java.util.Scanner;

import static oop_JG.A12obj_arr.ZPractice;
public class ZPractice1 {

    public static void main(String[] args) {

        System.out.println("학생정보 입력");
        Scanner sc = new Scanner(System.in);


        Score [] scoreList = new Score[100];

        int idx = 0;

        while(idx != scoreList.length){

            System.out.println("이름");
            String name = sc.next();
            if(name.equals("그만")){
                System.out.println("종료");
                break;
            }

            System.out.println("국어");
            int kor = sc.nextInt();
            if(!isValidateScore(kor)){
                System.out.println("재입력");
                continue;
            }

            Score s = new Score(name, kor);
            scoreList[idx] = s;
            idx++;

        }

        for(Score score : scoreList){
            if(score == null){
                break;
            }
        }
        score.scoreinfo();

    }
    sc.close;
}
