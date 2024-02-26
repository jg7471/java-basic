package oop_JG.A12obj_arr;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
//원시적
//        Person kim = new Person("김춘식",32,"남성");
//        Person lee = new Person("이아영",23,"여성");
//        Person park = new Person("박상성",35,"남성");
//
//        kim.personInfo();
//        lee.personInfo();
//        park.personInfo();

   //역시 원시적
        //int[] arr = new int[3];
        //Person[] people = new Person[3];
        //people[0] = new Person("김춘식",32,"남성");

        int[] arr = {1, 3, 5, 7, 9};
        Person[] people ={
                new Person("김춘식",32,"남성"),
                new Person("이아영",23,"여성"),
                new Person("박상성",35,"남성")
        };
        System.out.println(Arrays.toString(people));//주소값 반환
        //Stack(좁은 영역) Heap(넓은 영역)

        //비효율
//        people[0].personInfo();
//        people[1].personInfo();
//        people[2].personInfo();


//        for(int i = 0; i < people.length; i++){
//            people[i].personInfo();
//        }
        for (Person p : people) { //iter 향상for문(for each문)
            p.personInfo();//p.에는 주소값이 오는 것이다 *유의
        }
    }
}
