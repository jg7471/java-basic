package basic_JG.A09_11arrayJG;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify_boolean {
    public static void main(String[] args) {

        String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
        System.out.println("foods = " + foods); //주소값 동일

        foods[0] = "치킨";
        foods[2] = "탕수육";
        System.out.println("foods = " + foods); //주소값 동일

        System.out.println("------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(foods));
        System.out.println("찾을 음식 입력");
        String name = sc.next();

        boolean flag = false; //방법3 //찾으면 true 못찾으면 false
        //int i; //방법2 i값 for문 밖에서도 사용하기 위해
        for (int i = 0; i < foods.length; i++) { //인덱스 탐색
            System.out.println(Arrays.toString(foods));
            if (name.equals(foods[i])) {
                System.out.println("탐색완료, 인덱스" + i); // 빼기
                flag = true; //방법3 : 탐색완료면 즉시 종료
                //조건이 충족되었음을 나타내기 위한 신호
                //깃발 변수 //기본적으로 false 인데 하나라도 찾을 시 깃발을 들어라
                break;
            }
            // 미니 quiz 값 입력시 없는 값 찾기
            // else if(name.equals((foods[i]) == null)){ //null값 탐지 : 내가 작성
            // System.out.println("없는 음식");
            //  else if (i == foods.length - 1) { //방법1 : 마지막 인덱스
            //  System.out.println("없는 음식");
            if (!flag) {
                System.out.println("없는 음식입니다");

            }
        }
        //if (i == foods.length){ //방법2
        //System.out.println("없는 음식");  //
    }
}
