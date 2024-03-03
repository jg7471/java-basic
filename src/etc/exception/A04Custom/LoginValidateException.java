package etc.exception.A04Custom;

//내가 만드는 예외 타입
public class LoginValidateException extends Exception {//예외타입 이름+Exception 관례 // 예외 타입을 Exception 으로 상속 받는다

    //기본 생성자 alt insert
    public LoginValidateException() {}

    //커스텀 에러메세지를 받는 생성자
    public LoginValidateException(String message) //에러메시지 발생시 생성
    {
        super(message); //부모의 생성자를 부름
    }



}
