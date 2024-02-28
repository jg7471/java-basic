package oop_JG.A13inter.animal;

//인터페이스 - 클래스 : 구현(implements)
//클래스 - 클래스, 인터페이스- 인터페이스 : 상속
//클래스는 다중상속 x, 인터페이스 다중상속 o(인터페이스는 내용이 없기(추상메서드だけ)에 다중상속 허용)
public interface BadAnimal extends  Violent, Huntable{
}
