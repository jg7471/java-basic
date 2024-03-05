package etc.api.collection.Y4map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapGPT {
    //GPT
    public static void main(String[] args) {
        // 1. engKor이라는 이름으로 Map을 생성
        Map<String, String> engKor = new HashMap<>();

        // 2. 사용자에게 영단어를 입력받아서 Map에 삽입
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("영단어 입력 (종료하려면 '그만' 입력): ");
            String word = scanner.nextLine();

            if (word.equals("그만")) {
                break;
            }

            if (engKor.containsKey(word)) {
                System.out.println("이미 존재하는 단어입니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("뜻 입력: ");
            String meaning = scanner.nextLine();

            // 3. 영단어와 뜻을 Map에 삽입
            engKor.put(word, meaning);
        }

        // 4. 입력이 종료되면 모든 영단어와 뜻을 출력
        System.out.println("===== 영단어 및 뜻 =====");
        for (Map.Entry<String, String> entry : engKor.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();

    }
}