package oop_JG.A05this_super;

public class PracticeHealer extends PracticePlayer {

    public PracticeHealer(String name) {
        super(name);
        this.heal = 99;
    }

    @Override
    void characterInfo() {
        super.characterInfo();
    }
}
