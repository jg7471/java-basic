package oop_JG.A12obj_arr;

public class ZPractice {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

//    public void setTotal(int total) {
//        this.total = total;
//    }

    public double getAvg() {
        return avg;
    }

//    public void setAvg(double avg) {
//        this.avg = avg;
//    }

    public void setTotalAndAvg(){
        this.total=this.kor +this.eng +this.math;
        this.avg=this.total/3.0;
}
public void serchInfo(){
    System.out.printf("영어 %d 일어 %d 중어 %d 총점 %.2f 평균 %d", kor, eng, math, total, avg);
}

public static boolean isVaildateScore(int score){
        if(score > 100 || score < 0 ){
            System.out.println("점수 오류");
            return false;
        }
        return true;
}

}
