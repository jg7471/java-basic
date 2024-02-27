package oop_JG.A05this_super;

public class PracticePlayer {
    String name;
    int level;
    int atk;
    int hp;


    PracticePlayer() {
        System.out.println("Player1 생성자 호출");
        this.level = 50;
        this.atk = 2403;
        this.hp = 5430;
    }

    PracticePlayer(String name){
        System.out.println("Player2 생성자 호출");
        this();
        this.name = name;
    }

    PracticePlayer(String name, int hp){
        System.out.println("Player3 생성자 호출");
        this(name);
        this.hp = hp;
    }

    void attacks(PracticePlayer target){
        if(this == target){
            System.out.println("스스로 때릴 수는 없어요");
            return;
        }
        System.out.printf("%s가 %s를 공격합니다\n", this.name, target.name);
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체력은 %d, 상대의 체력은 %d", this.hp, target.hp);
    }

    void characterInfo(){
        System.out.println("아이디"+name);
        System.out.println("레벨"+level);
        System.out.println("공격력"+atk);
        System.out.println("체력"+hp);
    }

}
