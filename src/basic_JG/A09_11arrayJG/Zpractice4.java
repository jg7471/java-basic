package basic_JG.A09_11arrayJG;

import java.util.Arrays;
import java.util.Scanner;

public class Zpractice4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] kakao = new String[]{"무지", "네오", "어피치", "라이언", "춘식이"};

        System.out.println("값을 입려개주세요" + Arrays.toString(kakao));
        int index = -1;// 위치 잘 기억해!

        while (true) {
            String targetName = sc.next();
            for (int i = 0; i <= kakao.length; i++) {
                if (targetName.equals(kakao[i])) {
                    index = i;
                    break;
                }
            }
            if (index != -1) { // 위치 잘 기억해!
                System.out.println("변경하고픈 값을 입력하세요");
                kakao[index] = sc.next();
                System.out.println("변경완료" + Arrays.toString(kakao));
                break;
            } else {
                System.out.println("없는 값입니다" + Arrays.toString(kakao));
                continue;
            }
        }
        sc.close();
    }
}
