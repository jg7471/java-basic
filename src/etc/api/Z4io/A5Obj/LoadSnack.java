package etc.api.Z4io.A5Obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO.\\snack.sav")){

            //(자바에서 생성한)객체를 불러올 보조스트림 : 객체를 파일 리스트 형태로 추출 -> 스낵(Snack)에 저장됨 1번)
            ObjectInputStream ois = new ObjectInputStream(fis); //

            List<Snack> snackList = (List<Snack>) ois.readObject(); //오브젝트 타입인데 리스트라서-> 형변환 //Snack 클래스의 snack 객체명
            //@@@ObjectInputStream -> List<Snack) 형변환


            for(Snack snack : snackList){
                System.out.println("snack : "+snack);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
