package array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // #배열(array)
        // -> 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형

        // 1. 배열 변수를 선언
        int[] arr; //일종의 데이터 타입이라 가독성 좋음->1번 권장
        int arr2[]; //C언어 스타일

        // 2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
        // 생성할 때 배열의 크기를 지정해야 한다.
        arr = new int[5]; // arr에는 주소가 적혀있음 01234까지

        // 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
        // 배열의 초기화는 인덱스를 이용합니다.
        // 인덱스 : 배열 내부의 위치를 지정할 수 있는 값
        // 인덱스는 0번부터 시작하여 1씩 순차적으로 증가

        //arr = 65;
        arr[0] = 65; //요렇게 데이터 삽입, 자바는 push, index 없음
        arr[1] = 69;
        arr[2] = arr[0];
        arr[3] = (int) 3.14; //타입 불일치 : int형으로 변환 3
        //arr[4] = "Halou" //int 문자형x
        arr[4] = 100;
        //arr[5] = 123; index 범위 초과 //runtime exception 실행중에 에러 발생

        // 4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
        System.out.println("arrr 배열의 길이"+arr.length);

        // 5. 배열에 저장된 값을 참조(사용)하는 법 -> 인덱스를 활용
        System.out.println("배열의 1번째 데이터" + arr[0]);
        System.out.println("배열의 2번째 데이터" + arr[1]);
        System.out.println("배열의 3번째 데이터" + arr[2]);
        System.out.println("배열의 4번째 데이터" + arr[3]);
        System.out.println("배열의 5번째 데이터" + arr[4]);

        System.out.println("^_^;^_^;^_^;^_^;^_^;^_^;^_^;^_^;^_^;^_^;");

        // 6. 배열의 반복문 처리
        // 배열은 인덱스를 제어변수로 활용하여 쉽게 반복문 처리 가능
        for (int idx = 0; idx < arr.length; idx++){
            System.out.printf("배열의 %d번째 데이터 : %d\n", idx+1, arr[idx]);
        }

        // 7. 배열 내부의 요소값을 문자열 형태로 한눈에 확인하기
        // System.out.println("arr = " + arr);//16진수로 이뤄진 배열의 주소값
        System.out.println("arr = " + Arrays.toString(arr)); //arr 배열 내부를 보여주는 함수 *import필요

        // 8. 배열은 선언과 생성이 동시에가능
        // 자바는 항상 배열크기 정해줘야 함
        //타입   배열명
        double[] dArr = new double[3];
        String[] sArr = new String[4];
        byte[] bArr = new byte[10];

        // 배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화 됩니다.
        System.out.println(Arrays.toString(dArr)); //0.0
        System.out.println(Arrays.toString(sArr)); //null
        System.out.println(Arrays.toString(bArr)); //0

        // 9. 배열의 생성과 동시에 초기화도 하는 방법
        char[] letters = new char[]{'a','b','c','d'};
        System.out.println(Arrays.toString(letters));

        // 선언과 동시에 초기화를 할 때 딱 한번만 가능한 문법
        // 자바의 배열은 크기가 고정이라 변경 불가
        // 만약 배열의 크기를 늘리거나 줄이고 싶으면
        // 기존의 배열을 조작하는 것이 아니라, 새롭게 생성
        String[] names = {"Messi","Ronaldo","CWLEE"};
        //names = {"Messi","Ronaldo","CWLEE", "NeymarJR"} //추가 불가
        names = new String[] {"Messi","Ronaldo","CWLEE", "NeymarJR"}; //새로 정의할 시 가능
    }
}