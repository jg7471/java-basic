package etc.api.Z4io.A1Stream;

import java.io.FileInputStream;

public class InputStreamEx {

    public static void main(String[] args) {

        /*
             1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream 입니다.
             2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
             3. InputStream 객체는 생성자에 throws가 있기 때문에
              예외처리를 진행하셔야 합니다.
         */
        //그림,이미지, 오디오 파일 손상없이 가져올 때 많이 씀


        //FileInputStream fis = null; //중복 사용하기위해 //귀찮아서1 안씀

        //try-with-resources 문법을 사용하여 auto close를 진행할 수 있다(자바 8버전)
        //try-with-resources 사용하려면 close 하려는 객체가 AutoCloseable 인터페이스와 관계여야 합니다 2번
        try(FileInputStream fis = new FileInputStream("C:\\Users\\ICT4_15\\Desktop\\file\\asd");/*2번*/) {
            //fis = new FileInputStream("C:/MyWorkspace/test.txt");
            int data = 0;

            while(data != -1){//메서드가 더 이상 읽어올 값이 없다면 -1 반환
            //while(true){ //원본
                data = fis.read(); // 1바이트 단위로 데이터를 읽어들임
                System.out.print((char)data); //데이터를 char type으로 받기 : 한글 2바이트 , 영어 1바이트 : 영어로 써라
                //if(data == -1) break; //메서드가 더 이상 읽어올 값이 없다면 -1 반환 //원본
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        /* 귀찮아서1
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }
}
