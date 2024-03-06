package etc.api.Z4io.A5Obj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {
        List<Snack> snackList = new ArrayList<>();
        Collections.addAll(snackList,
                new Snack("콘칩", 1970, 1500, "Taste.good"),
                new Snack("사브레", 1980, 2500, "Taste.bad"),
                new Snack("오징어칩", 1985, 1800, "Taste.SOSO") //스낵객체 3개 생성 리스트에 등록
        );
        System.out.println(snackList);


        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO\\snack.sav")) {//뽑아냄 //파일 형식 .sav가 일반적

            //개체를 저장할 수 있는 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos); //fos
            oos.writeObject(snackList);//저장하고 픈 데이터

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
