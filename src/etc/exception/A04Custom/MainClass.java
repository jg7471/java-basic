package etc.exception.A04Custom;

import java.util.Scanner;

//240229 1220~ 인강 @@@
public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserLogin user = new UserLogin("abc1234", "aaa1111!");

        System.out.print("id: ");
        String id = sc.next();
        System.out.print("pw: ");
        String pw = sc.next();

        try {
            String result = user.loginValidate(id, pw); //지역변수
            System.out.println("result = " + result);
        } catch (LoginValidateException e) {
            e.printStackTrace();
        }

        sc.close();

    }

}


