package etc.api.Z4io.A3Rw;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterEx {
    public static void main(String[] args) {

         /*
         - 문자를 써서 저장할 때 사용하는 클래스 FileWriter 입니다.
         - 기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합합니다.
         !!! text 파일에 덮어 쓰기임
         */

        try(FileWriter fw = new FileWriter("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO\\test.txt")) {
            // \r: 캐리지 리턴 -> 커서를 맨 앞으로 땡기는 동작.
            // \n: 줄 개행(줄바꿈)
            // 상황과 환경에 따라서 줄 개행 시 커서를 맨 앞으로 안땡겨주는 경우가 있습니다.

            String text = "오늘은 240305입니다.\r\n 화요일"; //같이 넣는거 추천 \r\n = 리눅스 때문에

            fw.write(text);
            System.out.println("파일 정상 저장 완료");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
