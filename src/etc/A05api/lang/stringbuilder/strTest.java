package etc.A05api.lang.stringbuilder;

public class strTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        /* //작업소요시간 : 11.201초
        String str = "a";
        for (int i = 0; i < 500000; i++){
            str += "a";
        }
        */

        StringBuilder sb = new StringBuilder("a"); //0.014초 : 반복작업시 빠름 : 기존의 객체를 재활용
        for(int i = 0; i < 500000; i++){
            sb.append("a");
        }

        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end-start)* 0.001 +"초");

    }
}
