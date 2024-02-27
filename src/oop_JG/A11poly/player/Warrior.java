package oop_JG.A11poly.player;


public class Warrior extends Player {

    int rage;

    public Warrior(String name) {
        super(name);
        this.rage = 60;

    }

    /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
          마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */


    public void rush(Player p){
        System.out.printf("%s님이 %s님에게 돌진을 시전했습니다\n", this.name, p.name/*맞는 얘*/);

        int damage; String job;
        if(p instanceof Warrior){
            damage = 10; job = "전사";
        } else if(p instanceof Mage){
            damage = 20; job = "마법사";
        } else {
            damage = 15; job = "사냥꾼";
        }
        p.hp -= damage;
        System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n", p.name, job, damage);
        System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp);
        System.out.println("--------------------------------------------------");
    }





        //내가 작성
    /*
        public void rush(Player t){
            if(t instanceof Warrior){
                System.out.println("%s님이 10의 피해를 입었습니다", this.name);
                this.hp -= 10;
                System.out.println("%s님의 남은 체력 %d", this.name, this.hp);

            }else if(t instanceof Mage){

            }else if(t instanceof Hunter){
            }
    }
     */







    @Override//alt insert //charcter info void
     void characterInfo(){ //Player의 함수 ***캐릭터 정보***
        super.characterInfo();//부모요소 장착 //alt insert로 호출가능 : 상위 메서드 호출
        System.out.println("# 분노:" + rage); //warrior 固有特徴 출력!
    }
}
