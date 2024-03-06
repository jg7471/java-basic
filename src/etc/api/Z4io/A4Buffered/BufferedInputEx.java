package etc.api.Z4io.A4Buffered;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class BufferedInputEx {

    public static void main(String[] args) {

        /*
         # Buffered I/O
         - 버퍼를 이용해서 읽기/쓰기 성능을 향상시키는 클래스.
         - 버퍼: 데이터를 입/출력 하기 전에 임시로 저장해 두는 배열 형태의 공간.

         # 버퍼를 이용해야 하는 이유
         - 버퍼를 사용하지 않으면 입/출력이 너무 자주 일어난다. //계란을 한판에 들고 감
         ex)
             "Java Programming"을 쓰는 경우
             -> 기본 OutputStream을 사용하면 한 글자씩 16번의 출력이 발생.
             -> 버퍼에 저장해 놓고 한번에 쓰면 한 번의 출력으로 끝나지 않을까요?
         */
        long start = System.currentTimeMillis();


        try (FileInputStream fis = new FileInputStream("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO\\test.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)){ //bufferd 붙은거 원형을 생성자에 전달 @@@ ??

            int data;
            while ((data = fis.read()) != -1){//fis(느림) bis 모드 //대입연산 느려서 우선순위 떨어짐1) : 원래는 비교연산 우선진행2) : 결론 대입연산이 -1이 아니라면1)
                System.out.print((char) data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("실행결과 : " + (end - start)*0.001+"초"); //한글 깨지면 file reader/writer 사용

    }
}
