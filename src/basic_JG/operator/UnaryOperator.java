package basic_JG.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        // 증감 연산자(++, --)
        // 변수의 값을 단순히 하나 올리거나 내릴 때 사용

        int i = 1;
        System.out.println("i = " + i);
        int j = i++; //先 대입 后++
        System.out.println("i = " + j);
        int k = i++;
        System.out.println("i = " + k);

        System.out.println("--------------------------------");

        int x = 1;
        System.out.println("i = " + i);
        int y = ++x; //전위 연산
        System.out.println("i = " + j);
        int z = --x;
        System.out.println("i = " + k);




    }


}
