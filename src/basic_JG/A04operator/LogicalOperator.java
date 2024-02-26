package basic_JG.A04operator;

public class LogicalOperator {
    public static void main(String[] args) {

        // 비교 연산자(<, <=, >, >=, ==, !=)
        // 좌항과 우항의 크기를 비교하여, 결과값으로
        // 항상 논리형 타입의 값을 도출합니다.

        int x = 10, y = 20;
        System.out.println(x == y);
        System.out.println(x != y);

        /*
         # 논리 연산자 (&, &&, |, ||)
         - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
         1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
         2. |, ||: 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.

         &&, || -> 단축 평가 연산 (short circuit operation)
         - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
          우항의 연산을 진행하지 않습니다.
         */
        
        // 우항에 무조건 에러가 발생하는 식을 작성항 -> 좌항에서 결과가 나오면 우항을 실행하지 않음.
        // System.out.println(x > 10 & (y / 0 == 10)); //& 1개여도 가능함 : 오류
        System.out.println(x > 10 && (y / 0 == 10)); //& 1개여도 가능함 : 진
        System.out.println(x >= 10 || (y / 0 == 10)); // 좌항 true -> true
        
        // 논리 반전 연산자(!: 단항)
        // 단손히 논리값을 반전시킬 때 사용
        // true -> false, false -> true



    }
}