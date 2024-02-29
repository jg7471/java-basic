package etc_JG.exception.A01basic;

import java.util.Scanner;

public class FinallyExample {

    public static void main(String[] args) {
        String[] pets = {"강아지", "고양이", "짹짹이"};

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= pets.length; i++)
            try { //3까지
                System.out.println(pets[i] + " 키오고 싶다"); //i에 3 but pets 엔 3없음
                //배열의 인덱스 범위를 벗어나는 오류: 배열의 인덱스는 0부터 시작하므로 i가 pets.length와 같아지면 범위를 벗어납니다.
            } catch (Exception e) {
                System.out.println("애완동물의 정보가 없음니다");
            } finally {
                // finally 블록에는 예외 발생 여부와 상관없이, 항상 실행하고 싶은 문장을 작성
                // 객체를 반납하거나 메모리에서 해제할 때 (close()) finally 주로 사용
                System.out.println("아무튼 실행되는 문장");
                System.out.println("==================");
                //sc.close(); //for문 안에 sc.close() 입력 XXX : 예시 일뿐
            }

    }
}
