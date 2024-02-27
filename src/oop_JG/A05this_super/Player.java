package oop_JG.A05this_super;



public class Player {
    //생성자 기본값 세팅
    String name;
    //this.level = 1;
    //this.atk = 1;
    //this.hp = 50;
    int level;
    int atk;
    int hp;


    Player() { //기본 호출값1 : 생성자
        System.out.println("Player의 기본 생성자 호출");
        this.level = 1;
        this.atk = 3;
        this.hp = 50;
        //level = 1; //얘네들도 원래는 this 필요하는데 겹치지 않아서
        //atk = 3;
        //hp = 50;
    }

    Player(String name/* p2 name 새로 작성*/){ //값에 따라 호출값 2
        this();//내 다른 생성자 부르는 문법 //매개값 안 받겠다(level, atk, hp 기본대로 감)
        //System.out.println("Player 2번 생성자 호출");
        //System.out.println("생성자에서 this의 주소값: "+ this); //주소값 같다
//        level = 1;
//        atk = 3;
//        hp = 50;
        this.name = name; //this 생성되는 그 객체 : name값 p2에서 받음 //초기화됨
        //생성자를 호출한 그 객제 this = p2 : 플레이어2
        //name = name오류 시 -> name = pName*/ 요렇게 하면 되긴함
    }


    Player(String name, int hp){//3번째 생성자
        this(name);//기본생성자 값 호출 //다른 생성자의 호출은 생성자 내에서 항상 최상단에 위치해야함
        //@@ ->Player(String name) 요거 참고하겠다 : 갯수 같음
        System.out.println("Player의 3번 생성자 호출");
        //this.name = name; this에 집어 넣음
        this.hp = hp;
    }

    Player(String name, int hp, int atk) {
        this(name, hp);
        this.atk = atk;
    }




    void attack(Player target){ //Player 객체 받음
//        System.out.println("때리는 애 = " + this.name);
//        System.out.println("맞는 애 = " + target.name);
        if(this == target){
            System.out.println("스스로는 때릴 수 없어요");
            return;//종료
        }

        System.out.println("----------------------");
        //x가 y를 공격합니다
        System.out.printf("%s가 %s를 공격합니다 \n", this.name, target.name);

        //맞는 사람의 hp를 10 낮추고, 나의 체력을 5회복
        //결과를 출력하기.(나의 체력 : XX, 상대의 체력. XX)
        //target.hp = target.hp - 10;
        target.hp -= 10;
        this.hp += 5;
        System.out.printf("나의 체력은 %d, 상대의 체력은 %d\n",this.hp, target.hp);

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