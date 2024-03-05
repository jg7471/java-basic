package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

         /*
         # Map
         - Key / Value가 한 세트를 이루는 자료구조
         - Key값을 통해 Value를 참조하는 방식.
         - Key는 중복 저장을 허용하지 않는다.
         */

        //Map은 key, value 쌍을 이루기 때문에 멀티 제네릭을 설정
        Map<String, String> map = new HashMap<>(); //제네릭 2개

        //Map에 데이터를 추가하는 메서드 : put(key, value)
        map.put("멍멍이", "김철수");
        map.put("야옹이", "홍길동");
        map.put("짹짹이", "박영희");
        System.out.println(map);//{멍멍이=김철수, 야옹이=홍길동, 짹짹이=박영희}

        //Map은 Key의 중복 저장 허용X //Key 값 중요
        //만약 중복 Key를 사용하여 put을 호출하면 value만 수정됨
        map.put("멍멍이","김뽀삐"); //key 중복 //("멍멍이", "김철수"); 수정됨
        map.put("어흥이","홍길동"); //value 중복 //("야옹이", "홍길동"); 수정됨
        System.out.println(map);//{어흥이=홍길동, 멍멍이=김뽀삐, 야옹이=홍길동, 짹짹이=박영희}

        //Map 내부 Key의 존재 유무를 확인하는 메서드 : containsKey(Key)
        System.out.println(map.containsKey("야옹이"));//true //containsKey -> Object Key 선택
        System.out.println(map.containsKey("메뚜기"));//false

        //Map 내부의 값을 참조하는 법 : get(Key) //맵은 인덱스가 없어 , value가 딸려 나옴
        System.out.println(map.get("멍멍이"));//김뽀삐
        System.out.println(map.get("삐약이"));//null -> nullPointException 발생
        //->우선 containsKey 로 존재 유무 체크 -> map.get 으로 체크

        //Map 내부의 값을 참조하는 법: get(Key)
        String nick = "멍멍이";
        if(map.containsKey(nick)){
            System.out.printf("%s 별명을 가진 학생은 %s 입니다.\n", nick, map.get(nick)); //map, get(nick) 잘못적음
        } else {
            System.out.println("그런 별명을 가진 학생은 없어요");
        }

        //Map의 크기를 확인하는 메서드 : size()
        System.out.println("Map의 크기 : " + map.size());

        //iter : map X // list set O
        //Map에서 Key들만 추출하는 메서드 : KeySet()
        //1번)모든 Key들을 Set에 담아서 반환합니다 -> 2번)반복문 처리가 가능합니다 //Map index 없어서
        Set<String> Keys = map.keySet(); //1번

        for(String s : Keys){ //2번
            System.out.println("Result : Key : " + s + ", value: " + map.get(s)); //s KEY : get(s) Value
        }

        //Map의 객체를 삭제 : remove(Key)
        //Key를 주시면 value도 함께 제거됨
        map.remove("야옹이");
        System.out.println(map);

        map.clear();
        System.out.println(map);

    }
}