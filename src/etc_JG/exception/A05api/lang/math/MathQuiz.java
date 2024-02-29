package etc_JG.exception.A05api.lang.math;

public class MathQuiz {

    public static int page(int num) {
        return (int) Math.ceil(num / 10.0); //게시판 페이지
    }

    /*내가 작성
        for(int i = 1; i < 10; i++ ){
            int[] arr = new int[];
            if(i<=10){
                int[i/10]=i;
            }
    }
    */

    public static void main(String[] args) {

        System.out.println(page(123));
    }
}
