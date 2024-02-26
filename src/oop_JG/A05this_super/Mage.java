package oop_JG.A05this_super;

public class Mage extends Player {
    int mana;

    Mage(String name){
        super(name); //부모의 네임 호출(필요한거 직접 지목)
        this.mana = 100;
    }

    @Override //alt insert //charcter info void
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나: " + mana);
    }
}
