package etc.api.Z4io.A5Obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO.\\snack.sav")){
                //개겣를 불러올 보조스트림
            ObjectOutputStream ois = new ObjectOutputStream(fis); //이거 왜 obj 다른 타입이라서? @@@

            List<Snack> snackList = (List<Snack>) ois.readObject(); //오브젝트 타입인데 리스트라서-> 형변환


            for(Snack snack : snackList){
                System.out.println("snack : "+snack);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
