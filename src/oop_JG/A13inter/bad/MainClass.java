package oop_JG.A13inter.bad;

import util.Utility;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("진행하실 번호를 입력하세요");
        System.out.println("1. 가입 2. 로그인 3. 정보수정 4. 탈퇴");
        String menu = Utility.input("> ");

        if(menu.equals("1")){
            Join join = new Join(); //객체 생성
            join.join(); //메서드 실행

        }else if(menu.equals("2")){
            Login log = new Login();
            log.login();
        } else if(menu.equals("3")){
            Update update = new Update();
            update.update();
        } else if(menu.equals("4")){
            Delete del = new Delete();  //변수 객체
            del.delete(); //메서드 이름 다 다르게 세팅
        }

    }

}
