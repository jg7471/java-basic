package oop_JG.A05this_super;



public class Player {
    String name;
//    this.level = 1;
//    this.atk = 1;
//    this.hp = 50;
//    /* 같은 의미
    int level;
    int atk;
    int hp;


    Player() { //기본 호출값1
        System.out.println("Player의 기본 생성자 호출");
        this.level = 1;
        this.atk = 3;
        this.hp = 50;
        //level = 1; //얘네들도 원래는 this 필요하는데 겹치지 않아서
        //atk = 3;
        //hp = 50;
    }

    Player(String name/*pName*/){ //값에 따라 호출값 2
        System.out.println("Player 2번 생성자 호출");
        System.out.println("생성자에서 this의 주소값: "+ this); //주소값 같다
        level = 1;
        atk = 3;
        hp = 50;
        this.name = name; //this 생성되는 그 객체
        //생성자를 호출한 그 객제 this = p2.kim(플레이어2)
        /*pName*/; //name = name오류 :::: /name = pName*/ 요렇게 하면 되긴함

    }

    void characterInfo() {
        System.out.println("***캐릭터 정보***");
        System.out.println("# 아이디: " + name);//원래는 다 this.붙어야 함
        System.out.println("# 레벨: " + level);
        System.out.println("# 공격력: " + atk);
        System.out.println("# 체력: " + hp);
        System.out.println("지금 이 메서드를 부른 객체의 아이디: "+this.name);//각 호출값에 맞는 아이디 일치하게 됨

    }
}