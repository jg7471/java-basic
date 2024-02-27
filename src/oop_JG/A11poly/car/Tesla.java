package oop_JG.A11poly.car;

public class Tesla extends Car{ //car 상속받음

    @Override //부모가 물려받은 값 새롭게 정의
    public void run() { //부모에게 물려준 메서드를 자식이 고친 것
        System.out.println("테슬라가 달립니다");
    }

    public void activeAutopilot(){ // 부모가 알 수 없는 정보 : 자식이 확장한 개념
        System.out.println("테슬라의 오토파일럿을 가동합니다");
    }
}
