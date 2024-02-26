package oop_JG.A10encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();
        //my.year = 232343244; //직접 생성 막음 //정확, 틀린 값 모두 부정
        //my.year = 1992;(x)
        //my.setYear(1231233);//걸러냄, 실제 객체에 안들어감
        my.setYear(1992);
        my.setMonth(10);
        my.setDay(51);

        my.birthInfo();

        //System.out.printf("내 생일은 %년 %월 %일 입니다.\n",my.getYear("aaa111"), my.getMonth(), my.getDay());


<<<<<<< HEAD
        // 랄랄라
=======
>>>>>>> origin/main

    }



}




