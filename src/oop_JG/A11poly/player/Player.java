package oop_JG.A11poly.player;



public class Player {
    String name;

    int level;
    int atk;
    int hp;


    Player() { //기본 호출값1 : 생성자
        this.level = 1;
        this.atk = 3;
        this.hp = 50;

    }

    Player(String name/* p2 name 새로 작성*/){ //값에 따라 호출값 2
        this();
        this.name = name;
    }


    Player(String name, int hp){//3번째 생성자
        this(name);
    }


    void attack(Player target) {

        if(this == target) {
            System.out.println("스스로는 때릴 수 없습니다.");
            return;
        }

        // 출력 메세지: x가 y를 공격합니다.
        System.out.printf("%s(이)가 %s(을)를 공격합니다.\n", this.name, target.name);

        // 맞는 사람의 hp를 10 낮추고, 나의 체력을 5 회복하고 싶다.
        // 결과를 출력하자. (나의 체력: XX, 상대의 체력: XX)
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체력: %d, 상대의 체력: %d\n", this.hp, target.hp);



    }




    void characterInfo() {
        System.out.println("***캐릭터 정보***");
        System.out.println("# 아이디: " + name);//원래는 다 this.붙어야 함
        System.out.println("# 레벨: " + level);
        System.out.println("# 공격력: " + atk);
        System.out.println("# 체력: " + hp);
        //System.out.println("지금 이 메서드를 부른 객체의 아이디: "+this.name);//각 호출값에 맞는 아이디 일치하게 됨

    }
}