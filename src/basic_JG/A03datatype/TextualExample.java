package basic_JG.A03datatype;

public class TextualExample {

    public static void main(String[] args) {
        char c1 = 'A'; //only 1 letter
        System.out.println("c1 = " + c1);
        
        char c2 = 65; // 아스키코드
        System.out.println("c2 = " + c2);

        /*
         # 문자열을 저장할 수 있는 데이터 타입 String
         - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
         - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
         기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
         면접 단골 문제
         */

        String s1 = "my dream";
        String s2 = "is a programmer";

        // 문자열의 덧셈 연산 -> 문자열을 단순히 연결해서 결합한 결과
        System.out.println(s1 + s2);

        // 문자열과 다른 데이터 타입 간의 연산 -> 무조건 덧셈 연산의 결과와 같다
        int month = 6;
        int day = 9;
        System.out.println("내 생일은" + month + "월" + day + "일 입니다");

    }
}

