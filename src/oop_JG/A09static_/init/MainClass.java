package oop_JG.A09static_.init;

public class MainClass {
    public static void main(String[] args) {

        //DBManager manager = new DBManager();
//        System.out.println("magager.addr :" + manager.addr);
//        System.out.println("magager.addr :" + manager.uid);
//        System.out.println("magager.addr :" + manager.upw);

         /*
         - 정적 초기화자를 호출하려면 클래스를 로딩하시면 됩니다.
         # 클래스 로딩 방법
         1. 클래스의 이름을 참조하여 static 멤버를 호출.
         2. 객체를 생성함.
         - 정적 초기화자는 클래스 로딩 시 최초 1회만 호출됩니다.
         */

        //1번만 호출 가능<>생성자는 여러번 가능 //static 객체를 생성하지 않고도 class 이름으로 바로 호출 가능 //
        System.out.println("magager.addr :" + DBManager.addr);//static 바로 접근 가능
        System.out.println("magager.addr :" + DBManager.uid);
        System.out.println("magager.addr :" + DBManager.upw);
        //값 초기화 안해서 DBManager manager = new DBManager() -> null -> 정적 초기화 필요




    }
}