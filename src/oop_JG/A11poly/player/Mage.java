package oop_JG.A11poly.player;

public class Mage extends Player { //MainClass 로 잘못 먹음.. 차이점 알기 @@
    int mana;

    Mage(String name){
        super(name);
        this.mana = 100;
    }
/* 내가 작성
    public void blizzard(){
        System.out.println("30의 마나가 소모됩니다, %d", rn-100);
    }
*/
    public void blizzard(Player[] target){
        System.out.printf("%s님이 눈보라 시전\n", this.name);//그냥 name해도 되지만(mage안) 좀 더 명확
        this.mana -= 30;//print에서 출력하면 본질은 바뀌지 않음
        System.out.printf("30의 마나 소모됩니다, 남은 정신력 %d\n", this.mana);
//        System.out.println("--------------------------------");
        for (Player p : target) {
            if(p == this) continue; //자신에게 마법이 맞을 경우 continue(패스)
            int damage = (int)(Math.random()*/*16-10*/6 + 10); //10부터 16미만
            p.hp -= damage;
            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.name, damage, p.hp);
        }
    }


    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나: " + mana);
    }
}
