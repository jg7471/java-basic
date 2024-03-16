package Subway.main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class AppUI {

    private static Scanner sc; //아래 sc.nextLine(); 오류 떠서 생성

    public static int inputInteger(String message) { //정수
        System.out.println(message);
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("# 올바른 정수 입력값이 아닙니다");
        } finally {
            sc.nextLine();
        }

        return num;
    }
}
