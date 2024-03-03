package etc.A05api.lang.obj;

//toSting 많이 씀 equal+hash 가끔 clone 가끔

public class MainClass {

    public static void main(String[] args) { //메인 메서드란??@@@

        Person kim = new Person("홍길동",25); //@@@언급한거 인강
        Person hong = new Person("홍길당",25); //hash는 이름 같아야 함

        //String name = "박영희";
        String name1 = new String("박영희");

        //System.out.println("redPen = " + redPen); // 주소값 나옴(hash 없을때 인듯)
        System.out.println("kim 주소값"+kim.toString()); //주소값 나옴 (hash 없을 때인듯) //원래는 .toString()생략-object라
        System.out.println("name1 Test"+name1);// 문자값 나옴


        //객체 타입의 변수를 출력하거나 값을 얻을 때는
        //뒤에 자동으로 .toString()이 붙어서 진행됨.(Object 가 물려주는 메서드) : 그래서 생략해도 괜찮
        //System.out.println(kim.toString()); //주소 출력 //object
        System.out.println(kim);
        System.out.println(hong);
        System.out.println(name1);

        if(kim.equals(hong)){
            System.out.println("이름과 나이가 같네요");
        }else{
            System.out.println("이름 or 나이 or  둘 다 다를 수도");
        }
        //object 최상위 부모 메서드 준비함 : 자식들이 오버라이딩해서 커스텀해서 사용하라
        //kim.equals(hong); //kim == hong 의미

        /*
        System.out.println(kim.hashCode()); //자바에서는 기본적으로 객체와 객체는 동등하다 : 객체는 다른데 주소는 동일
        System.out.println(hong.hashCode()); //주소값 다르면 ? 다른 객체 ,
        //이름 = 나이 같으면 동일한 객체로 하자 : equals 메소드 자성할 때 1) hashCode 있어야 동일한 주소값 얻을 수 있음 : hashSet
        Set<Person> set = new HashSet<>(); // 주소값 같을 시 중복 객체값 제거하고 출력
        set.add(kim);
        set.add(hong);
        System.out.println(set);
           */

        // 문법 밑줄 쳐져있으 사라질 가능성 多
        /* finalize는 gc가 호출되는 순서를 보장하지 않기에 권장X : 쓸 일 없음 (deprecated)
        hong = null; // @@@??인강
        kim = null;
        System.gc(); //가비치 컬렉터 호출 (부른다고 바로 안 올수도...(우선순위대로)) : 사용권장 X
        */

        Person park = new Person("박복제인간",100);
        //Person clonePeson = park; // park-> clonePerson 주소값 넘긴 것 뿐임 : 객체복사 X

        try {
            Person clonePerson = (Person) park.clone();//예외처리 해야 함 : clone 리턴타입 object : 형 변환 필요
            System.out.println("복사된 객체 정보 : " + clonePerson);
            //System.out.println("park의 주소 : " + park.hashCode());
            //System.out.println("복제된 객체 주소 : " clonePerson.hashCode());
            //주소를 넘기는 것 얕은 복제, cloned : 깊은 복제
            park.setName("박영희");
            System.out.println("clonePerson");


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}