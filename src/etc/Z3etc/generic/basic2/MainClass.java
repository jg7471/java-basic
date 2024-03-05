package etc.Z3etc.generic.basic2;

public class MainClass {

    public static void main(String[] args) {



        //
        Box<Integer, String> box = new Box<>(1, "홍길동");
        String name = box.get(1);//스트링 타입으로 변함 //지역변수
        //box.get(1)은 Box 클래스의 get 메서드를 호출하여 키 1에 해당하는 값을 반환
        //이 값은 String 타입이기 때문에 이 값을 name 변수에 저장할 수 있습니다
        //즉, name 변수에는 "홍길동"이라는 문자열이 저장됩니다.

        box.put(10, "박영희");
        System.out.println(box);
        //제네릭 클래스 : 타입에 맞게 생성자 메서드 리턴타입 변함 : 유동성 있음
        //타입의 안정성
    }
}
