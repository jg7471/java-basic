//package array;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Practice240221 {
//    public static void main(String[] args) {
//
//        //검색 shift ctrl A
//        //파일명 변경 shift f6
//        //Ctrl + Shift + F
//        //Scanner
//        Scanner sc = new Scanner(System.in);
//        int answer = sc.nextInt();
//        String degree = sc.next();//공백 미포함
//        //next(): 공백이 없는 문자열을 입력받습니다.
//        //nextLine(): 공백을 포함한 문자를 입력받습니다.
//        //nextInt(): 정수 데이터를 입력받습니다.
//        //nextDouble(): 실수 데이터를 입력받습니다.
//        sc.close();
//
//        //print
//        int month = 12;
//        int day = 25;
//        String anni = "크리스마스";
//
//        // 12월 25일은 크리스마스 입니다.
//        System.out.println(month + "월" + day + "일은" + anni + "입니다");
//        System.out.printf("%d월 %d일은 %s 입니다.", month, day, anni);
//        System.out.printf("총점 : %d점, 평균 %.2f점", total, avg); // print로 했더니 오류 발생
//        //%d : 정수, %f : 실수, %s 문자
//        //\n 줄 개행 \t 가로 공백(스페이스 4칸)
//
//        //double rate = 64.126; // %(.2)f=실수 소수점 2자리 (%%)=%
//        //System.out.printf("합격률: %.2f%%", rate); //64.13%
//
//        int i = 72;
//        char c = (char) i; //上->下
//
//        double d = 4.98765;
//        int j = (int) d; //4
//
//        int k = 10;
//        double d = k / 4; //int 와 int의 계산이라 소숫점 버림
//        System.out.println("d = " + d); //2
//
//        if (j % 136 == 0) ;
//
//        //3항 연산
//        int x = 10, y = 20;
//        String result = x > y ? "x는 y보다 큽니다" : "x는 y보다 작습니다.";
//        String result = (rn % 2 == 0) ? "짝" : "홀";
//
//        int rn = (int) (Math.random() * 355 + 42); //42 ~ 396사이의 난수
//        int rn = (int) (Math.random() * 10 + 1); //1~10
//        int rn2 = (int) (Math.random() * 91 + 10); //10~100 @@@
//
//        boolean flag = false;
//        if (!flag) {
//            System.out.println("flag = " + flag);//false ?@@@
//        }
//
//
//        //switch 정수/문자열/연산의 결과값 :: 实数X
//        switch (point / 10) { // 94/10=9.5 int값은 소수점 뗌
//
//        ///////////////////////////////////////////////
//
//        int[] arr; // 배열 선언
//        System.out.println("arrr 배열의 길이"+arr.length);
//
//        for (int idx = 0; idx < arr.length; idx++){ //배열 조회 방법1
//            System.out.printf("배열의 %d번째 데이터 : %d\n", idx+1, arr[idx]);
//        }
//
//        System.out.println("arr = " + Arrays.toString(arr)); //배열 조회 방법2
//
//        double[] dArr = new double[3];
//        String[] sArr = new String[4];
//
//        // 9. 배열의 생성과 동시에 초기화도 하는 방법
//        char[] letters = new char[]{'a','b','c','d'};
//        System.out.println(Arrays.toString(letters));
//
//
//        String[] names = {"Messi","Ronaldo","CWLEE"}; // 1회용 크기변경불가
//        names = {"Messi","Ronaldo","CWLEE", "NeymarJR"} // 변경하고프면 새롭게 생성
//
//
//            if(name.equals("그만")){//자바 Style 문자열 비교only
//        names[i] = name;
//        for(String n : names) // 자바 style for of 문
//
//        double avg = (double) total / scores.length;
//        System.out.printf("총점 : %d점, 평균 %.2f점", total, avg); // print로 했더니 오류 발생
//
//
//        //깃발 변수 //기본적으로 false 인데 하나라도    찾을 시 깃발을 들어라
//                boolean flag = false;
//                if(!flag){
//                    System.out.println("flag = " + flag);
//                }
//
//                boolean flag = false;
//                flag = true;
//                if(!flag)
//    }
//
