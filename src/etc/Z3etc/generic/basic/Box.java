package etc.Z3etc.generic.basic;

public class Box<T> { //제네릭 클래스로 선언. //박스 객체 생성할 때 제네릭 타입으로 설정 : //필드와 리턴값 다 바뀜

    //Box box = new Box();
    //Box<String> box = new Box(); //타입 자동으로 세팅됨
    //Box<Integer>box = new box();


    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    /*
    Setter : <저장> 외부로부터 데이터를 전달받아 멤버변수에 저장.
          매개변수만 있고, 리턴값은 없는 메서드로 정의.

    Getter : <리턴> 내부의 멤버변수에 저장된 값을 외부로 리턴.
          메개변수는 없고, 리턴값만 있는 메서드로 정의한다.
          메서드명은 주로 getXXX() 메서드 형식으로 지정
          XXX은 해당 멤버변수의 변수명을 사용.


    */
}
