package oop_JG.A10final_.field;

//마지막 필드 → 더 이상 값의 변경은 없다.
//method fianl 오버라이딩 막음
//class fianl 상속 막음
public class MainClass {
    public static void main(String[] args) {

        Person kim = new Person("손흥민");
        //kim.name = "김민재"; //이미 final로 선언하여 이름 변경불가
        //kim.nation = "미국"; //final로 선언하여 변경불가
        kim.age = 30; //non final

        Person park = new Person("박지성");
        //park.nation = "영국"; //xx
        //park.name = "백승호"; //xx


    }
}

