package etc.exception.A04Custom;

public class LoginValidateException extends Exception {//예외타입 끝 Exception 관례


    public LoginValidateException() {}//기본 생성자 alt insert

    public LoginValidateException(String message) { //커스텀 에러 메세지를 받는 생성자
        super(message); //부모의 생성자를 부름
    }



}
