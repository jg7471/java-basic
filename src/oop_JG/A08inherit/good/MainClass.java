package oop_JG.A08inherit.good;

public class MainClass {
    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        w1.name = "Varian";
        w1.level = 80;
        w1.atk = 12041;
        w1.hp = 16012;
        w1.rage = 5620;//warrior에서 추가한 값//자식이 먼저 고친거 优先 메서드 오버라이딩(재정의)
        w1.characterInfo(); //자식값 호출

        Hunter w2 = new Hunter();
        w2.name = "Valeera";
        w2.level = 75;
        w2.atk = 7560;
        w2.hp = 8400;
        w2.pet = "비상식량";
        w2.characterInfo();

        Mage w3 = new Mage();
        w3.name = "Jaina";
        w3.level = 65;
        w3.atk = 760;
        w3.hp = 2000;
        w3.mana = 5400;
        w3.characterInfo();

    }
}
