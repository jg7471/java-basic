package oop_JG.A05this_super;
/*
# 자식 클래스, 하위 클래스 (Child, Sub class)

- 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
 자식 클래스라고 합니다.

- 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
 키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.
*/
public class Warrior extends Player {

    int rage;

    public Warrior(String name) {
        //alt insert 자동 생성자
        //모든 생성자에는 super()가 내장되어 있음
        //자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
        //부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문

//        Player() { //기본 호출값1
//            System.out.println("Player의 기본 생성자 호출");
//            this.level = 1;
//            this.atk = 3;
//            this.hp = 50; //고대로 물려 받음

        super(name);//부모의 생성자가 대신 초기화 해줌01     //ctrl 누르고 클릭
        //this.name = name;//필요없어짐 01
        this.rage = 999; //요거만 직접처리함 //기본생성자가 기본스탯 //2번생성자가 닉네임 저장
    }


    @Override//alt insert //charcter info void
     void characterInfo(){ //Player의 함수 ***캐릭터 정보***
        super.characterInfo();//부모요소 장착 //alt insert로 호출가능 : 상위 메서드 호출
        System.out.println("# 분노:" + rage); //warrior 固有特徴 출력!
    }


     /*
     # 메서드 오버라이딩(재정의)
     - 부모가 물려주는 메서드는 모든 자식들에게 다 맞게 설계되기 힘들기 때문에
      부족한 점이 있거나, 아예 맞지 않는 경우에는 자식 클래스 쪽에서
      내용을 추가하거나 수정할 수 있습니다. 이를 오버라이딩 이라고 합니다.

     - 만약 자식 클래스에서 부모가 물려준 메서드를 새롭게 재 정의한다면
      자식이 수정한 메서드가 우선적으로 호출됩니다.

     - 오버라이딩의 규칙이 있습니다. (3가지 모두 일치해야 오버라이딩 인정)
     1. 부모가 물려주는 메서드와 이름이 똑같을 것!
     2. 부모가 물려주는 메서드와 리턴 타입이 똑같을 것!
     3. 부모가 물려주는 메서드와 매개변수의 선언 방식이 똑같을 것!
     */
}
