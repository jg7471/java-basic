package oop_JG.A08inherit.good;

public class Hunter extends Player{
    String pet;
    @Override
    void characterInfo(){

        super.characterInfo();
        System.out.println("# 펫 이름:" + pet);
    }


}
