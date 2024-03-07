package video.main;

import video.ui.AppUi;

import static video.ui.AppUi.inputInteger;

public class Main {
    public static void main(String[] args) {

        AppController controller = new AppController();//객체 생성

        while (true) {
            AppUi.startScreen(); //reurn3 돌아감
            int selectNumber = inputInteger(">>>");
            controller.chooseSystem(selectNumber);//해당 서비스를 갈아 끼워줌 //reurn2 끝
        }


    }

    //public static class AppController {} // 얘 때문에 chooseSystem 문제발생함 뭐지?

}
