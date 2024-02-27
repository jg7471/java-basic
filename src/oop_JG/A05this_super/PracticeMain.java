package oop_JG.A05this_super;

public class PracticeMain {

    public static void main(String[] args) {


        PracticePlayer x1 = new PracticePlayer();
        x1.name = "플레이어1";
        x1.characterInfo();

        PracticePlayer x2 = new Player("플레이어2");
        x2.characterInfo();

        PracticePlayer x3 = new Player("플레이어3", 100);
        x3.characterInfo();

        x1.attacks(x2);






    }
}