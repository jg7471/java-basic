package etc.api.util.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExample {
//요 친구의 위치 @@
    public static void main(String[] args) {

        char[] arr = {'J','A','V','A'};
        //char[] arr2 = arr; //주소값 복사(얕은 복사)
        char[] arr2 = Arrays.copyOf(arr, arr.length); //복사하고픈 배열, 길이(1234)
        char[] arr3 = Arrays.copyOfRange(arr, 1,3); //[A, V] //1부터 3미만 //인덱로 범위지정

        //arr[2] = 'F'; //배열 복사 맞게 되었는지 체크

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3)); //[A, V]



        //배열의 탐색 :binarySearch(배열, 검색할 값)
        //반드시 정렬이 선행되어야 함. = 2진 탐색
        //존재하지 않는 값이라면, 음수로 표현되는데, 해당 값이 존재해야 할 위치를 알려줌.
        int[] numbers = {1,3,5,7,9,11,13};
        System.out.println("9의 위치 : " + Arrays.binarySearch(numbers,9));//01234

        //배열의 정렬
        int[] nums = {42,123,23,43,43,24,5,45,3,76,9};
        Arrays.sort(nums); //void 메서드;
        System.out.println(Arrays.toString(nums));

        //배열 내부 요소가 모두 동일한지의 여부를 확인
        arr[2] = 'F'; //배열 복사 맞게 되었는지 체크
        System.out.println(Arrays.equals(arr, arr2)); //모두 일치해야 true


    }
}
