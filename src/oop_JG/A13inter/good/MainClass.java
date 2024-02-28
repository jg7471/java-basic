package oop_JG.A13inter.good;

import util.Utility;

public class MainClass {
    public static void main(String[] args) {

        // 다형성 적용을 위해 인터페이스 타입의 변수를 하나 선언
        //같은 기능을 통일하게 만들어 주는 틀 역할
        IUserService sv; //선언만 해라

        System.out.println("진행하실 번호를 입력하세요");
        System.out.println("1. 가입 2. 로그인 3. 정보수정 4. 탈퇴");
        String menu = Utility.input("> ");

        if(menu.equals("1")){
            sv = new Join(); //일일히 변수 선언 안해도 됨
            sv.execute();
        }else if(menu.equals("2")){
            sv = new Login();
            sv.execute();
        } else if(menu.equals("3")){
            sv = new Update();
            sv.execute();
        } else if(menu.equals("4")){
            sv = new Delete();
            sv.execute();
        }

    }

}
