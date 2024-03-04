package etc.api.collection.list;

import util.Utility;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static util.Utility.*;

public class ListQuiz02 {
        /*
         1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현
          User클래스의 생성자는 모든 필드값을 받는 생성자 1개.

         2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method)
         3. User 객체를 3개 생성해서 리스트에 추가하세요. (main method)

         4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문)
         5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면
               그 객체를 삭제해 주세요. (일반 for문)
            //향상 for문에서 list 크기 변화하면 안됨 or 바로 찾을 시 바로 break
         */

    public static void main(String[] args) {


        //List<User> UserList = new ArrayList<>();
        List<User> userList = new ArrayList<>(); //type User class


        /*大방법1
        User hong = new User("홍길동",20);
        User kim = new User("김춘식",5);
        User park = new User("박영희",24);

        //UserList.add(hong); //방법1
        //UserList.add(kim);
        //UserList.add(park);

        Collections.addAll(UserList,hong,kim,park); //방법2
        */

        //大방법2
        Collections.addAll(userList,
                new User("홍길동",20),
                new User("김춘식",5),
                new User("박영희",24)
                );

        for(User user : userList){
            System.out.println(user); // toString()
        }

        makeLine();

        /*
         - forEach(향상 for문)을 사용하여 반복문을 순회할 때
          리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
         - 향상 for문은 반복문을 시작할 때 구조적으로 컬렉션의
          크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
          값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.
        */

        /*
        for(User user: userList){
            if(user.getName().equals("홍길동")){ //user의 getName()이 홍길동이라면
                UserList.remove(user); // UserList에서 지우겠다
                break;//향상 for 문에서 list 크기 변화하면 안됨 or 찾을시 바로 break;
                //or 크기가 바뀌는 순간, 향상 for 문 고장남(자바, 자바스크립트 동일)
            }
        }
        */

        for( int i = 0; i < userList.size(); i++){
            /* 방법1
            User user = userList.get(i); //userList의 i번째 꺼냄 : user라고 지역변수 지정
            String name = user.getName(); //user객체에서 이름 호출 : name라고 지역변수 지정
            if(name.equals("홍길동")){
                UserList.remove(i);
                //List크기 달라져도 영향 X
            }*/

            //방법2
            if(userList.get(i).getName().equals("홍길동")) { //메서드 채인링 리턴값의 연결연결
            userList.remove(i);
            }
        }
        System.out.println(userList);




        /*내가 작성
        List<String> UserList = new ArrayList<>();

        User ArrayList = new User();

        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();

        for (list o : ArrayList) {
            if(list.equals("홍길동")){
                ArrayList.remove(this.name);
            }
        }
        */
    }
}
