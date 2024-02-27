package oop_JG.A05this_super;

public class MainClass {
    public static void main(String[] args) {

        //메인 : 생성자 출력
        //메인 : main 열기

        Player p1 = new Player();
        p1.name = "플레이어1";
        p1.characterInfo();

        System.out.println("-----------------------------");

        Player p2 = new Player("플레이어2");
        //System.out.println("main에서 p2의 주소값: " + p2);//주소값 같다
        p2.characterInfo();

        System.out.println("-----------------------------");

        Player p3 = new Player("플레이어3", 100);//3번째 생성자
        p3.characterInfo();

        System.out.println("-----------------------------");
        p1.attack(p2); //p1 this //p2 target
        p2.attack(p3);
        p3.attack(p1);

        System.out.println("-----------------------------");
        Warrior w1 = new Warrior("전사짱짱맨");
        w1.characterInfo();

        Mage m1 = new Mage("해리포터");
        m1.characterInfo();

        Hunter h1 = new Hunter("손은눈보다빠르다");
        h1.characterInfo();

    }
}
