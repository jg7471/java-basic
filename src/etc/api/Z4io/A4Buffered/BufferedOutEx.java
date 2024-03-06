package etc.api.Z4io.A4Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutEx {
    public static void main(String[] args) {

        System.out.println("시작");
        //dummy data
        StringBuilder text = new StringBuilder();

        for(int i = 0; i < 1000000; i++){
            text.append(i+ "Halou\n");//반복작업 스트링 빌더가 더 빠름 // 문자열을 맨 끝에 추가하는 메서드 append(문자열)
        }

        long start = System.currentTimeMillis();

        // Buffered 가 붙은 객체들은 기존에 사용했던 객체를 생성자의 매개값으로 전달
        // ex) BufferedOutStream -> FileOutputStream 매개값으로 받아야 함
        // BufferdInputStream -> FileInputStream 매개값으로 받아야 한다
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO\\test.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos)){

        //더미 데이터를 StringBuilder로 생성함
        //새로운 String 객체 생성 -> 생성자의 매개값으로 StringBuilder를 전달
        //바이트 데이터로 변환
            String str = new String(text);
            for (byte b : str.getBytes()) {
                bos.write(b); //fos bos 모드

            }

            //byte[] data = str.getBytes(); //바이트 배열로 진행
            //fos.write(data); //fos bos 모드 변경

        } catch (Exception e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("소요시간:"+(end-start)*0.001+"초");
    }
}
