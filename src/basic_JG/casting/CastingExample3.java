package basic_JG.casting;

public class CastingExample3 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;
        int cc = c;
        int intResult = c + i; // 先값 넣고 alt+enter 로 추천 받음
        char charResult = (char) (c + i);

        System.out.println("cc = " + cc);
        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);

        int k = 10;
        double d = k / 4; //int 와 int의 계산이라 소숫점 버림
        System.out.println("d = " + d);

        //방법 1 : //d = (double)k / 4;
        //방법 2 : //d = k / 4.0; // 한 쪽만 double(큰 쪽 4.0) 줘도 됨-> 작은 쪽이 큰 쪽을 따라감
        System.out.println("d = " + d);
    }
}
