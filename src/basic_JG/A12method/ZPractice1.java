package basic_JG.A12method;

public class ZPractice1 {

    static int calcTotal(int end) {
        int total = 0;
        for (int i = 1; i <= end; i++) {
            total += i;
        }
        return total;
    }


    static int clacRangeTotal(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += 0;
        }
        return total;
    }


    static String selectRandomFood() {
        double rn = Math.random();
        if (rn > 0.66) {
            return "치킨";
        } else if (rn > 0.33) {
            return "보쌈";
        } else {
            return "김밥";
        }
    }

    static int clacNUmberTotal(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    static int clacNumberTotal2(int... nums){
        int total = 0;
        for(int n : nums){
            total += n;
        }
        return total;
    }




    public static void main(String[] args) {
        int result = calcTotal(10);
        System.out.println(result);

        System.out.println(calcTotal(100));

    }


}
