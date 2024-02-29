//package etc_JG.exception.A04Custom;
//
//public class UserLogin {
//
//    String userAccount;
//    String userPassword;
//
//    public UserLogin(String userAccount, String userPassword) { //생성자 생성 alt insert
//        this.userAccount = userAccount;
//        this.userPassword = userPassword;
//    }
//
//    public String loginValidate(String inputAccount, String inputPassword)  //@@@ 다시 240229 4교시 초반
//        throw LoginValidateException { //로그인 실패시 예외 발생됨
//            //계정명이 일치하는가?
//
//            if (this.userAccount.equals(inputAccount)) {
//                if (this.userPassword.equals(inputPassword)) {
//                    return "SUCCESS";
//                } else {
//                    //패스워드 틀림!
//                    //타입이 String 이라 return 판별 불가
//                    //하나라도 틀렸을 경우 에러 고의 발생
//                    throw new LoginValidateException("비밀번호 트렬씀이자다");//커스텀 에러
//                }
//            } else {
//                //계정정보 틀림
//                throw new LoginValidateException("회원가입부터 하세요");
//            }
//        }
//
//    //로그인 검증
//
//
//}