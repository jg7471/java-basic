package etc.exception.A2throws;

public class ThrowsExample {

    // 객체 생성하기 귀찮으니 static
    static String[] greetings = {"Hello", "哈喽", "ハロー"};

    //예외 떠넘기기 (throws) // 예외를 강제로 발생시키는 throw (raise - 발생시키다)

     /*
     # throws

     - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
      예외 처리를 메서드의 호출부로 떠넘기는 방식입니다.

     - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시
      예외 처리를 강요하고 싶을 때 사용합니다.

     - 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능합니다.
     */

    static void greet(int idx) throws Exception{ //선언부 //throws + 예외타입 //1)예외처리 전가 : 호출부(main)에서 오류를 처리하여라
        System.out.println(greetings[idx]); // 3 여기서 오류 발생 //오류 발생 : 객체 생성됨??@@ 240229 1144 3교시
        // 배열의 길이 0123
    }

    public static void main(String[] args) { //main에 throws 붙이면 -> 자바가상머신 처리 : 처리 안하겠다는 의미 : 선언 XX
        try {
            greet(3); //3 //2)throws Exception 전달 받고 //호출부
        } catch (Exception e) {
            System.out.println("인덱스 범위를 벗어남"); //3)throws Exception 전달함 -> 오류
            e.printStackTrace(); //실무에서 사용多 : 메서드 예외 발생 원인을 逆추적
            //그 이유는 무엇인지 메세지를 통해 개발자에게 전달
            System.out.println("예외 발생 원인 : " + e.getMessage()); //예외 알려주긴 하지만 간략함 <<< e.printStackTrace
        }
        System.out.println("프로그램 정상종료");
        //throws Exception 있을 경우 인덱스 값에 따라 오류 발생할 수도 있다 : 경고 의미
        //예외를 한곳으로 모아서 : 모아진 예외를 간결히 처리
    }
}
