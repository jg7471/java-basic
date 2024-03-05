package etc.api.collection.Y3set;

import etc.api.lang.obj.Person;

import java.util.*;

import static util.Utility.*;

public class A1HashSetExample {
    public static void main(String[] args) {
        /*
         # Set
         - 집합을 구현해 놓은 인터페이스
         - 요소로 같은 값이 들어오는 것을 허용하지 않는다.

         # Hash //암호화 쪽에서 많이 사용 : 비번 DB 저장
         - 어떤 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘
         - 예측할 수 없는 값을 이용하기 때문에 정렬이 불가능.
         - 생성된 값으로 원래 값을 찾는 것도 불가능에 가깝다.
         - 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
         - 속도가 빠르고 보안성이 뛰어난 알고리즘. 객체의 주소값을 할당하거나
          암호화 알고리즘에서 많이 사용됩니다.
         */

        List<String> list =new ArrayList<>(); //전환 가능(지도 보셈) //Map은 안됨

        //Set//인터페이스 다형성 적용
        Set<String> set = new HashSet<>(); //Set : 인덱스 없어서 저장보장 X : 저장순서 중요하면 list 사용
        //객체를 저장 : add(객체)
        set.add("Java");
        set.add("JSP");
        set.add("Spring");
        set.add("Oracle");
        Collections.addAll(set,"mySql","Java"); //추가
        //#컬렉션 객체들은 Colletions 의 기능을 사용할 수 있습니다. :List
        //Collections 는 컬렉션 객체들의 부가 기능들을 지원
        System.out.println(set); //[Java, JSP, mySql, Spring, Oracle] //Java 중복 삽입 -> 안됨

        //set의 크기 확인 : size()
        System.out.println("set의 크기: " + set.size());//5 : 12345

        /*
         - set은 인덱스가 없기 떄문에 메서드를 이용해서 객체를 얻는게 아니라
          반복자 (Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
          반복자 객체는 set 인터페이스가 제공하는 iterator()를 호출하여
          얻어옵니다.
        */
        Iterator<String> iter = set.iterator(); //iter 객체
        //String element = iter.next(); //element 지역변수
        //System.out.println("element = " + element); //Java : 앞에서 부터 출력

        //element = iter.next();
        //System.out.println("element = " + element); //JSP


        /*
         Iterator 객체의 메서드 next()를 통해
         내부 요소를 하나씩 꺼내올 수 있습니다.
         next()를 요소의 개수보다 많이 호출하게 되면
         NoSuchElement 예외가 발생합니다.

         hasNext() -> 반복자가 가지고 있는 객체를 더 가지고 올 수 있는지의
         여부를 확인하는 메서드를 통해 next()를 호출하셔야 합니다.
        */

        /*//방법1
        while(true){
            //System.out.println(iter.next()); //무작정 for문 돌리면 에러 발생
            if(iter.hasNext()){
                System.out.println(iter.next());
            } else {
                break;
            }
        }
        */

        while(iter.hasNext()){ //거의 안씀
            System.out.println("."+iter.next());
        }

        makeLine();//alt enter

        //배열과 리스트 외도 사용 가능
        for (String s : set) { //향상 for문 사용가능(일괄적) : 대부분 이렇게 씀 //어떤게 iter 쓸 수 있는지 인강
            //if(s.equals("Java"))
            System.out.println(s);
            /* 결과
            Java
            JSP
            mySql
            Spring
            Oracle
            */
        }

        //set에서 객체를 삭제 : remove(객체) :인덱스가 없으므로 객체 직접 지목
        set.remove("JSP");
        System.out.println(set); //[Java, mySql, Spring, Oracle]

        //set을 list로 전환 -> 생성자의 매개값으로 set을 전달
        ArrayList<String> ConvertedList = new ArrayList<>(set);//set->ArrayList 전환 //지도 봐보셈 //ConvertedList 객체
        System.out.println(ConvertedList); //list 중복 허용 //set 선언 후 ->list 전환 시 중복없어짐

        //set 객체 전체 삭제
        set.clear();
        System.out.println(set);

        //set 중복 X, 저장순서 보장 X

        /*
         # 객체에서 equals 메서드를 오버라이딩 할 때 hashCode도 같이 오버라이딩 해야 하는 이유
         - Hash 알고리즘을 사용하는 다른 객체가 본래의 속성을 띄게 하려면
          객체의 필드값이 같았을 때 같은 hashCode의 값을 띄게 해 줘야 한다.
          (HashSet -> HashCode를 통해 중복 여부를 확인하기 때문.)
         */

        //인강 @@@ equals만 오버라이딩하고 hash 오버라이딩 하고 건들 필요 없는거죠?
        Set<Person> personSet = new HashSet<>(); //obj.Person; (java lang api) 객체 불러오기
        Person kim = new Person("김춘식",30);
        Person kim2 = new Person("김춘식",30);

        System.out.println(kim.equals(kim2));

        personSet.add(kim); personSet.add(kim2);
        System.out.println(personSet);
        //헤쉬코드 오버라이딩 X - 두 코드 다른 객체로 인식 - 중복 허용
        //-> equal/hash 같이 오버라이딩 : Person 직접 만들 클래스 : 중복객체 허용(hash 오버라이딩 안해서)
        //equals/hash 같이 오버라이딩!!!
    }
}
