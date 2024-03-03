package etc.exception.A03throw;

public class ThrowExample {

    static int calcTotal(int num) throws Exception{//던짐 main으로

        /*
         # 예외를 강제로 발생시키는 키워드 throw

         - 메서드나 생성자 실행 도중에 throw 키워드를 만나면
          즉시 throw로 생성한 예외가 발생합니다.

         - 예외가 발생되면 실행되던 코드는 즉시 중단되고 예외를 처리할 수 있는
          catch문으로 바로 이동하게 됩니다.

         - 이를 적절히 활용하면 void가 아닌 메서드를
          강제로 종료시킬 때 사용할 수 있습니다.
          또한, 에러 상황은 아니지만 프로그램 실행에 적절치 못한 상황에서
          코드의 흐름을 바꿔 줄 수가 있습니다.
         */


        if(num <= 0){
            throw new Exception();//예외 강제로 생성하는 기능 throw, 에러타입 Exception()

            //return 0;// 메서드 강제종료 break : method 内 사용 불가
            // 반복문 종료 only return? void만 가능 : return 값 뭐라도 줘야 하기에 0줌 @@@
        }

        int total = 0;
        for (int i = 1; i <= num; i++) { //-120 에러는 아니나 i가 num 만나자 마자 바로 종료
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calcTotal(100));
            System.out.println(calcTotal(-120));
        } catch (Exception e) {
            System.out.println("매가값을 0보다 크게 주세여");
        }



    }
}
