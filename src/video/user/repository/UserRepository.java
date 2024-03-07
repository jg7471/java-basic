package video.user.repository;

import video.user.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private static final Map<Integer, User> userDatabase = new HashMap<>();//외부에서 바로 접근 X : static 유저데이터공유 final : 유저주소 접근 방지(final 굳이..)
    //private static final: userDatabase 변수는 클래스 레벨에서 정의되며,
    //private로 선언되어 클래스 외부에서 직접 접근할 수 없습니다.
    //또한 static으로 선언되어 클래스의 모든 인스턴스가 공유하는 정적 변수입니다.
    //마지막으로 final 키워드가 사용되어 변수의 값이 한 번 초기화되면 변경할 수 없도록 설정되었습니다.


    /*STATIC @@@???*/
    public List<User> findUserByName(String userName) { //리턴 타입(동명이인 전부 나오게=list 타입) //List<User>는 User 객체의 집합
        List<User> userList = new ArrayList<>();//배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
        //User 객체들을 저장하기 위한 동적 배열인 ArrayList를 생성하고, 이를 List 타입의 변수인 userList에 할당하는 코드
        //전달받은 userName 로 반복문 -> map 반복문 X ->간접

        //Map을 반복 처리하기 위해 key들을 Set으로 반환
        for (int key : userDatabase.keySet()) {//Map에서 Key들만 추출하는 메서드 : KeySet() -> for문 돌림
            User user = userDatabase.get(key); //Map 내부의 값을 참조하는 법: get(Key)
            if (user.getUserName().equals(userName)) {//User 객체의 name이 매개값으로 받은 name과 같다면
                userList.add(user); //리스트에 객체를 추가
            }
        }
        return userList;
    }

    public User deleteUser(int delUserNum) { //delUserNum : KEY 값 //리턴 : User : remove하면서 리턴하겠다 ?? @@@@
        //System.out.printf("\n### %s[%s] 님의 회원정보가 정삭 삭제되었습니다.\n", delUser.getUserName(), delUser.getUserName()); 호출??
        return userDatabase.remove(delUserNum);
        //메서드는 주어진 유저 번호에 해당하는 사용자를 삭제하고, 삭제된 사용자 객체를 반환합니다.
        //만약 해당하는 유저 번호가 맵에 존재하지 않는다면 null이 반환됩니다.
    }

    //이름을 통해 회원 검색 : 동명이인이 있다면 모두 리턴하기 위해 List 리턴 타입 설정

    //회원 추가 기능
    public void addUser(User user) { //@@@@변수 이름은 마음대로?
        userDatabase.put(user.getUserNumber(), user); //유저에서 겟 넘버 꺼내서 유저로 등록 @@@
        //key 손흥민 , - value 전화번호: 0102111111, 등급: BRONZE
    }

    public User findUserByNumber(int userNumber) {
        return userDatabase.get(userNumber);
    }
}
