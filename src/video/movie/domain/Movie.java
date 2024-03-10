package video.movie.domain;

import video.user.domain.User;

//Movie 저장소
public class Movie {


    private static int movieSequence;

    private int serialNumber; //식별번호 //DB에선 자동 생성됨
    private String movieName; //영화제목
    private String nation; //국적
    private int pubYear; //발매년도
    private int charge; //대여가격
    private boolean rental; //대여 가능 여부
    private User rentalUser; //현재 대여자 정보

    public Movie(String movieName, String nation, int pubYear) { //MovieService로 부터 전달 받겠다
        this.serialNumber = ++movieSequence; //세트
        this.movieName = movieName;
        this.nation = nation;
        this.pubYear = pubYear;
        this.charge = ChargePolicy.calculateDvdCharge(this); //지금생성되는 this 주소값을 보내겠다
    }

    @Override
    public String toString() {
        String rental = this.rental ? "대여중" : "대여가능"; //rental 체크 //boolean  기본값 false = 대여가능 : 추가로 로직 안써도 됨
        //this.rental true 대여중 false 대여가능
        return
                "## DVD번호: " + serialNumber +
                        ", 영화명: " + movieName +
                        ", 국가명: " + nation +
                        ", 발매연도: " + pubYear + "년" +
                        ", 대여료: " + charge + "원" +
                        ", 대여상태: " + rental;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMovieName() {
        return movieName;
    }

//    public void setMovieName(String movieName) {
//        this.movieName = movieName;
//    }
//
//    public String getNation() {
//        return nation;
//    }

    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean isRental() {
        return rental;
    }

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    public User getRentalUser() {
        return rentalUser;
    }

    public void setRentalUser(User rentalUser) {
        this.rentalUser = rentalUser;
    }


}


