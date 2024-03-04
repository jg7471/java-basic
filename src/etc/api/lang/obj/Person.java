package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable { // Cloneable 사용하기 세팅 //extends Object 입력하지 않아도 자동생성
//ctrl O 기본 object 값 오버라이딩

private String name;
private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    //toString() 기존에는 주소값 뜨는데-> 오버라이딩을 통해 내 입맛으로 바꿈
    //->sout 해서 출력값 설정(personInfo) 할 필요 없음 //이름 : name , 나이 age 세 <-이런거
    //toString() : 객체의 정보(필드)를 문자열 형태로 리턴.
    //toString() 오버라이딩 내 입맞에 맞게 재정의
    @Override //ctrl O //부모가 물려준 메서드 내부만 변경 가능 //toString 커스텀
    public String toString() {//겉에 틀 못바꿈 : 오버라이딩 규칙 : 1리턴타입 동일 2메서드 이름 동일 3메서드 매개변수 동일
        return "Person [이름: " +name+ ", 나이" +age+ "]";
    }

    //@@@ equals 클릭시 api 조회 안됨
    //equals 입력후 마법사로 생성-기본 equals 입맛에 맞게 수정
    @Override // 기존o를 드래그하고 shift f6 : 일괄 이름변경 가능
    public boolean equals(Object obj) { //equals 마법사로 만듦 //오버라이딩 return, equals//Object :타입은 변경 불가 : 변수명은 기존 o : 변경가능 obj로 변경 // type, 매개변수 개수 증가 XXX
        if (this == obj) return true; //주소값이 같다면 같은 객체야 //여기 왜 주소값? @@@
        if (obj instanceof Person) { //obj가 Person type을 갖을 수 있어? 좌항 객체 우항 타입
            Person p = (Person) obj; //obj(부모) Person p 타입 확인 불가 -> (Object)->(Person)obj 형 변환-> name과 age를 확인하기 위해서
            // person타입 필요 -> instanceof로 걸러준다
            //object 타입을 person 타입으로 형변환 ->name과 age를 확인하기 위해

            if(this.name.equals(p.name) && this.age == p.age){ //이름/나이 같은지
            //Person 타입만 갖을 수 있는 타입객체만 내림 : 그 객체의 this.name과 전달된 p.name이 같다면
                // equals를 부른 this.age의 age와 p.age와 같니 (p.age = obj로 거름)
                return true;
            }
        }
        return false; //이외는 false
    }


    //equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    //equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    //hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)
    @Override //equal + hashCode 세트메뉴 = 중복개체를 허용하지 않음 //set 집합 : 같은 객체 허용X : hashCode를 통해 걸러내기 때문
    //equal + hashCode 同时 오버라이딩 必!!! //hash : 같은 중복 피하겠다 : hash 코드 건들지 마셈, equals만 입맞에 맞게 편집
    public int hashCode() { //1) 주소값 출력 메소드 //요 메소드 유무에 따라 값 달라짐
        return Objects.hash(name, age); //name, age 맞춰준다 //만약 name만 같아도 된다하면 age 지워도 됨 //hash에 대해 자세히 알지 않아도 됨
        //return Objects.hash(name); //이름만 같길 원하는 경우
    }

//    public Person() { //생성자
//        super();
//    }

    @Override //객체 소멸 직전에 내용 작성 : 사용 권장XXX
    //생성된 객체가 사라지는 시점에서 자동으로 호출(Garbage Collector 가 실행될 때 자동실행됨)
    protected void finalize() throws Throwable {
        System.out.println(this.name + "이가 죽었습니다");
        super.finalize();
    }

    //객체 복사 메서드
    // Cloneable 인터페이스 구현해서 사용해야 함 : 객체 복사해서 쓸 일 어의 없음
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) { //name만 변경
        this.name = name;
    } //setn입력하면 setName 가능

    //이거 위에도 적음
    //toString() 기존에는 주소값 뜨는데-> 오버라이딩을 통해 내 입맛으로 바꿈
    //->sout 해서 출력값 설정(personInfo) 할 필요 없음 //이름 : name , 나이 age 세 <-이런거
    //toString() : 객체의 정보(필드)를 문자열 형태로 리턴.
    //toString() 오버라이딩 내 입맞에 맞게 재정의
    public void personInfo(){
        System.out.println("이름"+name);
        System.out.println("나이"+age+"세");
    }



}
