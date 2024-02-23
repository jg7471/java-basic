package oop_JG.A05this_super;

public class Mage extends Player {
    int mana;

    @Override //alt insert //charcter info void
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나: " + mana);
    }
}
