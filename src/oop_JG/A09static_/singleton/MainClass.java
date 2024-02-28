package oop_JG.A09static_.singleton;

public class MainClass {
    public static void main(String[] args) {

        //Singleton s = new Singleton(); //private로 처리해서 사용불가
        //메서드를 호출하기 위해 객체가 필요
        for(int i = 0; i <= 10000; i++) {
            Singleton s = Singleton.getInstance();//싱글톤 .getInstance() 메서드 호출
            s.method1();
            s.method2();
            System.out.println("s ="+ s); //1만번 호출시 같은 주소값 : 무분별하게 생성되는 객체 방지
            //범용적으로 생성되는 객체는 싱글톤 사용하여 데이터 남용 방지


        }
    }
}
