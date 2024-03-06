package etc.api.Z4io.A1Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

    public static void main(String[] args) {

        /*
             1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다.
             2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
             3. io패키지의 모든 클래스들은 생성자에 throws(예외 강제 발생) 키워드가 있기 때문에
             try-catch 블록을 항상 작성해야 합니다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("파일명 : ");
        String fileName = sc.next();

        FileOutputStream fos = null; //우선 널 값 주고 ,try에서 본격적으로 사용(finally에서 또 사용되어서(스코프))

        try { //
            fos = new FileOutputStream("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO" + fileName + ".txt"); //java.io 패키지 //핵심

            System.out.println("문장을 입력하세여");
            sc.nextLine(); //파일명 작성 후 엔터 때린거 처리(\n)
            String text = sc.nextLine();

            byte[] arr = text.getBytes(); // 지역변수 : 문자열 데이터를 바이트 데이터로 변환 //핵심
            fos.write(arr); // 파일을 바이트 단위로 써 내림 //핵심

            System.out.println("파일이 정상적으로 저장되었습니다.");//경로설정 한 곳에 txt파일 작성

        } catch (Exception e) {
            e.printStackTrace();
        }finally { //예외 발생하던 말던 무조건 실행(옵션) //객체 반납할 때 자주 씀
            //스트림을 더 이상 사용하지 않는 경우
            //시스템 자원을 반납하는 코드를 꼭 장성합니다(메모리 누수 방지)
            try {
                fos.close(); //변수의 스코프 : 블록단위에서만 사용 가능
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}