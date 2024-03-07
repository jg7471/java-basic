package video.user.repository;

import video.user.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private static final Map<Integer, User> userDatabase = new HashMap<>();//외부에서 바로 접근 X : static 유저데이터공유 final : 유저주소 접근 방지(final 굳이..)

    /*STATIC @@@???*/
    public List<User> findUserByName(String userName) { //리턴 타입(동명이인 전부 나오게=list 타입)
        List<User> userList = new ArrayList<>();//배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
        //전달받은 userName 로 반복문 -> map 반복문 X ->간접

        // Map을 반복 처리하기 위해 key들을 Set으로 반환
        for (int key : userDatabase.keySet()) {///Map에서 Key들만 추출하는 메서드 : KeySet()
            User user = userDatabase.get(key); // key 값을 통해 User 객체 얻기
            if (user.getUserName().equals(userName)) {//User 객체의 name이 매개값으로 받은 name과 같다면
                userList.add(user); //리스트에 객체를 추가
            }
        }
        return userList;
    }

    public User deleteUser(int delUserNum) { //delUserNum : KEY 값 //리턴 : User : remove하면서 리턴하겠다 ?? @@@
        //System.out.printf("\n### %s[%s] 님의 회원정보가 정삭 삭제되었습니다.\n", delUser.getUserName(), delUser.getUserName()); 호출??
        return userDatabase.remove(delUserNum);
    }

    //이름을 통해 회원 검색 : 동명이인이 있다면 모두 리턴하기 위해 List 리턴 타입 설정

    //회원 추가 기능
    public void addUser(User user) {
        userDatabase.put(user.getUserNumber(), user); //유저에서 겟 넘버 꺼내서 유저로 등록 @@@
    }

    public User findUserByNumber(int userNumber) {
        return userDatabase.get(userNumber);
    }
}
