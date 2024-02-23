//패키지 선언은 항상 클래스 최상단 위치
package oop_JG.A04pac;//폴더 변경 alt + enter

//장성중인 패키지와 다른 곳에 위치한 클래스 정보를 불러오려면 import 필요
//import oop_JG.A04pac.fruit.Apple;
//import oop_JG.A04pac.fruit.Banana;
//import oop_JG.A04pac.fruit.Melon;
import oop_JG.A04pac.fruit.*; //* ALL : fruit 패키지의 모든 클래스를 import 하겠다 : 소량일 경우 낱개로 소환하셈
import oop_JG.A04pac.juice.*;

public class MainClass {
    public static void main(String[] args) {

        /*
        1. 패키지를 만들어서 클래스를 배치하면, 클래스 최 상단에 패키지 구문이 포함되게 된다.
        2. 패키지 이름은 소문자로 지어주는 것이 관례이다.
        3. 상위 패키지와 하위 패키지를 구분할 때는 .(dot)을 사용한다.
        4. 패키지 이름을 지을 때에는 식별자 규칙이 적용된다. 자바의 키워드는 패키지 이름으로 사용할 수 없으며, 특수문자($, _ 제외) 및 숫자로 시작하는 패키지 이름도 사용할 수 없다.
        */

        // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 명시해야 함

//        Apple a = new Apple(); //alt enter import 가져오기(상담에 다 가져와짐)
        oop_JG.A04pac.juice.Apple a2 = new oop_JG.A04pac.juice.Apple(); //juice의 Apple, 나중에 생성된 애가 패키지 이름
        //이름이 같아 풀네임


        Banana b = new Banana();
        Melon m = new Melon();


        //java.util.Scanner sc = new java.util.Scanner(System.in); // import 없이 Scanner 사용 // 비추





    }
}
