package video.user.domain;

import video.order.domain.Order;

import java.util.HashMap;
import java.util.Map;

public class User {
    //DB 역할


    public static final int SILVER_PRICE = 5000; //모든 유저가 공통적으로 가져야 하는 영역 등급 //여기서만 변경 가능:외부서 변경 불가
    public static final int GOLD_PRICE = 7000;
    public static final int VIP_PRICE = 10000;

    private static int sequence; //회원 누적 순차번호

    private int userNumber;
    private String userName;
    private String phoneNumber;

    private Grade grade; // enum grade 추가
    private int totalPaying; // 총 결제 금액

    private Map<Integer, Order> orderList; // 각 회원마다 가지는 대여 목록



    public User(String userName, String phoneNumber, Grade grade) {//생성자 생성
        this.userNumber = ++sequence; //회원이 생성될 때 회원 고유번호를 하나 올려서 대입. //DB에선 자동으로 가능함(자바는 일단 연습)
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
        this.orderList = new HashMap<>();
    }

    public Map<Integer, Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order){
        this.orderList.put(order.getMovie().getSerialNumber(), order); //getMovie key, value order

    }

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        User.sequence = sequence;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getTotalPaying() {
        return totalPaying;
    }

    public void setTotalPaying(int totalPaying) { //totalPaying 값에 따라 grade 분류
        this.totalPaying += totalPaying; //누적하기

        //회원이 대여를 진행할 때 이 setter 가 호출됨
        //총 결제금액에 따라 회원 등급을 조정

        if (this.totalPaying >= VIP_PRICE) {//this 변수 충돌 방지
            this.grade = Grade.VIP;
        } else if (this.totalPaying >= GOLD_PRICE){
            this.grade = Grade.GOLD;
        } else if (this.totalPaying >= SILVER_PRICE) {
            this.grade = Grade.SILVER;
        }

    }

    @Override
    public String toString() {
        return  "## 회원번호: " + userNumber +
                ", 회원명: " + userName +
                ", 전화번호: " + phoneNumber  +
                ", 등급: " + grade;
    }
}
