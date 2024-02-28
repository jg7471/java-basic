package oop_JG.A13inter.good;

public class Login implements IUserService {

    public Login(){
        System.out.println("로그 요청 들어옴");
    }

    @Override
    public void execute() {
        System.out.println("로그 요청 들어옴");
    }
}
