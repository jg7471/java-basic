package etc.A05api.lang.math;

import javax.lang.model.SourceVersion;

public class MathExample {

    public static void main(String[] args) {
        //올림
        int ceil = (int)Math.ceil(1.1); //소숫점값 형변환
        System.out.println("ceil = "+ceil);
        
        //내림
        int floor = (int)Math.floor(1.5);
        System.out.println("floor = "+floor);
        
        //반올림
        double round = Math.round(3.141592*100)*0.01; //소숫점 2자리 까지 표현 3자리면 1000*0.001
        System.out.println("round = " + round);

        //제곱
        double pow = Math.pow(3.0, 4.0); //3의 4승
        System.out.println("pow = " + pow);
        
        //최대값(크기 비교, 2개만 가능)
        int max = Math.max(2, 10);
        System.out.println("max = " + max);
        
        //최소값
        int min = Math.min(24, 53);
        System.out.println("min = " + min);
        
        //절대값
        int abs = Math.abs(-77);
        System.out.println("abs = " + abs);
        


    }
}
