package oop_JG.A13inter.good;

//public class Join {
public class Join implements IUserService{


    public Join() {
        System.out.println("회원 가입 요청이 들어옴");

    }
    @Override
    public void execute() {
        System.out.println(" DB 접속도 하고, 입력 값도 가져오고, 값을 집어 넣고 등등...");
    }


}
