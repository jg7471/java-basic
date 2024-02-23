package basic_JG.A12method;

import java.util.Scanner;

public class ZPractice2 {
    static String[] foods = {"김밥", "치즈김밥", "김치볶음밥", "돈까스김밥", "탕수육"};

    static void push(String newFood){
        String[] temp = new String[foods.length+1];
        for(int i = 0; i <= foods.length; i++){
            temp[i] = foods[i];
        }
        temp[temp.length-1] = newFood;
        foods=temp;
        temp=null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = new String[]{"김밥", "치즈김밥", "김치볶음밥", "돈까스김밥", "탕수육"};

    }

}
