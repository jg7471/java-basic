package etc.api.Z4io.A1Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SteamCopy {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\ICT4_15\\Desktop\\fileee\\xx.jpg");
                 FileInputStream fis = new FileInputStream("C:\\Users\\ICT4_15\\Desktop\\fileee\\copy.jpg")) {///*내보내기 장소*/

            int data = 0;
            while (data != -1) {
                //1byte 단위로 데이터를 읽어들임과 동시에 데이터 작성
                data = fis.read(); //읽어 들이기
                fos.write(data);; //쓰기
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
