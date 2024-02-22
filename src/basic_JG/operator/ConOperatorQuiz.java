package basic_JG.operator;

public class ConOperatorQuiz {

    public static void main(String[] args) {

        //파일 이름 ConOperatorQuiz
        /*
         - 42 ~ 396사이의 난수를 발생시킨 후
         발생한 난수가 홀수인지 짝수인지의 여부를
         3항 연산식으로 출력해 보세요.

         ex)
         발생한 난수: XX
         3항 연산의 결과: 홀수입니다. or 짝수입니다.
        */

        /*내가 작성
        int x = 0;
        int rn = (int) ((((Math.random() * 421) + 10) < x) < ((Math.random() * 3960) + 10));
        String result = x;
        result % 0 ? "짝수" : "홀수";
        */

        int rn = (int) (Math.random()*355 + 42);
        System.out.println("rn = " + rn);

        String result = (rn % 2 == 0) ? "짝" : "홀"; //괄호 빼먹음
        System.out.println("3항 연산의 결과 " + result);


        System.out.println("3항 연산의 결과 : " + (rn % 2 == 0 ? "짝수" : "홀수")); //오류 처리 +빼먹음



    }
}
