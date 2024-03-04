package oop_JG.A12obj_arr;

import java.util.Scanner;

import static oop_JG.A12obj_arr.Score.isValidateScore; //static으로 불러오기

public class ScoreMain {

    public static void main(String[] args) {


         /*
         - Score 객체를 담을 수 있는 배열을 선언하세요.
          배열의 크기는 넉넉하게 100개로 하겠습니다.

         - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
         입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
         총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
         (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
         객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
         이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.

         - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
          scoreInfo()를 모두 불러주세요. (반복문)
          주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
          모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)

          **Hint 힌트
          그만 이후 null로 가득참 -> 빈값에서 메서드 호출 불가 -> null 입력시 그만둬야함
          String 배열 null 들어가는거 참조

         */


        Score[] scoreList = new Score[100]; //@@ Score 타입? //클래스 타입
        Scanner sc = new Scanner(System.in);

        System.out.println("학생 점수 입력 프로그램");
        System.out.println("입력창에 '그만' 입력하면 종료됩니다");
        int idx = 0;

        //종료조건 1. 그만 2. 더 이상 객체 넣을게 없다
        while(idx != scoreList.length){ //방법3 : 같아졌다면 종료
        //while(scoreList[scoreList.length-1] == null){//인덱스는 항상 배열의 길이보다 -1 //방법2

            //while(true){ 방법2 : 무한루프
            //if(scoreList[99] != null) break;
            //if(scoreList[scoreList.length-1] != null) break;

            System.out.println("# 이름");
            String name = sc.next();
            if(name.equals("그만")){//"그만" 거르기
                System.out.println("입력을 종료합니다");
                break; //마우스 위에 올려둘 시 break 대상 알려줌
            }

            //Score s = new Score(); //객체 생성 : 불러오기 static 붙이면 필요없어짐

            /*
            System.out.println("# 국어");
            int kor = sc.nextInt();
            if(!s.isValidateScore(kor)){
                continue;
            }
            */

            System.out.println("# 국어");
            int kor = sc.nextInt();
            if(!isValidateScore(kor)){
                continue;
            }

            System.out.println("# 영어");
            int eng = sc.nextInt();
            if(!isValidateScore(eng)){
                continue;
            }

            System.out.println("# 수학");
            int math = sc.nextInt();
            if(!isValidateScore(math)){
                continue;
            }

//            s.setName(name); //private로 가려져서
//            s.setKor(kor);
//            s.setEng(eng);
//            s.setMath(math);
//            s.setTotalAndAvg();

            Score s = new Score(name, kor, eng, math); //@@




            /* 방법1
            int total = kor + eng + math;
            double avg = total / 3.0; //소숫점 나올 수도 있으니
            s.setTotal(total);
            s.setAverage((avg));
            */

            scoreList[idx] = s; //idx를 이용해서 idx 지목 //@@
            idx++;

            System.out.println("***학생 정보 입력 완료***");
            //입력 반복문 끝
        }

         for (Score score : scoreList) { //iter
            if(score == null) break; //null 유무 체크 : ifn이락 검색해도 됨
            //객체 배열 안엔 주소 들어가있음, 입력x -> null
            //NullPointerException (유명한 에러)(변수, 배열에 null값 포함됨 : 문법상 에러는 없으나 처리해야함

            score.scoreInfo();
            System.out.println("----------------------------");
        }
        sc.close();

    }
}