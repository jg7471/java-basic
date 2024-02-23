package basic_JG.A04operator;

public class ConditionalOperator {

    public static void main(String[] args) {
        /*
         # 3항 연산자
         - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
         - (조건식 ? 좌항 : 우항);
         - 조건식을 비교하여 true일 경우에는 좌항이,
          false일 경우에는 우항의 값이 도출됩니다.
         */
        
        //3항 연산
        int x = 10, y = 20;
        String result = x > y ? "x는 y보다 큽니다" : "x는 y보다 작습니다.";
        System.out.println("result = " + result);

        //난수를 발생시키는 메서드 Math.random();
        // 0.0이상 1.0미만의 실수 난수값을 반환

        //1~10까지의 정수 난수 발생
        //Math.floor(math.random()*10) + 1; ->javascript
        int rn = (int) (Math.random()*10 + 1); // 앞자리 +1 // 형변환 자동(floor 노 필요)
        System.out.println("rn = " + rn);

        //10~100까지 정수 난수를 발생
        int rn2 = (int) (Math.random()*91 + 10);
        System.out.println("rn2 = " + rn);




    }


}
