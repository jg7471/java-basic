package etc_JG.exception.A05api.lang.obj;

public class Person extends Object{//입력하지 않아도 자동생성
//ctrl O 기본 object 값 오버라이딩

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void personInfo(){
        System.out.println("이름"+name);
        System.out.println("나이"+age+"세");
    }

}
