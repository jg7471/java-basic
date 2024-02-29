package etc_JG.exception.A05api.lang.obj;

public class MainClass {

    public static void main(String[] args) { //메인 메서드란??@@@

        Person kim = new Person("김춘식",30); //@@@언급한거 인강
        Person hong = new Person("홍길동",25);

        //String name = "박영희";
        String name1 = new String("박영희");


        //객체 타입의 변수를 출력하거나 값을 얻을 때는
        //뒤에 자동으로 .toString()이 붙어서 진행됨.(Object가 물려주는 메서드)
        System.out.println(kim.toString()); //주소 출력 //object
        System.out.println(hong);
        System.out.println(name1);


    }
}
