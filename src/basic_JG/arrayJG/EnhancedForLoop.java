package basic_JG.arrayJG;

public class EnhancedForLoop {

    public static void main(String[] args) {
        /*
         # 향상된 for문 (forEach)
         - 제어변수(인덱스)의 사용 없이 배열 내부의 요소를
          전체 참조할 수 있게 해 주는 반복문.

         ex)
         for(배열 요소를 받아줄 수 있는 변수 : 배열변수명) {
             반복 실행문
         }
         */
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        for (String day : week) {
            System.out.println(day + "요일 안조아"); //전체조회 밖에 안됨
        }

        System.out.println("----------------------------");

        /*
         1. scores라는 이름으로 int배열을 하나 선언해서
         점수 데이터를 저장하세요.
         {96, 88, 74, 63, 100, 55}
         */

        int[] scores = {96, 88, 74, 63, 100, 55};

        int total = 0;
        for (int s : scores) {
            total += s;
        }

        double avg = (double) total / scores.length; //(double)한쪽만 해도됨 작은 타입이 큰타입으로 맞춰감
        System.out.printf("총점 : %d점, 평균 %.2f점", total, avg); // print로 했더니 오류 발생


        /* 내가 작성
        double[] arr = {96, 88, 74, 63, 100, 55};
        double total = 0
        for (double n = 0 :arr){
            n += arr;
            double avg = n / arr.length;
        }
        int sum = n;
        System.out.println("토탈", sum);
        System.out.println("평균", arr);
        */

         /*
         2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
         총점(int), 평균(double, 소수점 둘째 자리까지 출력)
        */

    }
}
