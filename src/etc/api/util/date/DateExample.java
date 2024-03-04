package etc.api.util.date;

import util.Utility;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static util.Utility.*;

public class DateExample {
    public static void main(String[] args) {

        Date date = new Date();//Date import 추가 : 지역변수 삽입
        System.out.println(date);

        //Utility.makeLine(); ////alt enter
        makeLine();

        //현재 날짜 정보 얻기 연월일
        LocalDate now = LocalDate.now(); //메소드
        System.out.println(now);

        //현재 시간 정보 얻기 시분초
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        //현재 날짜와 시간 정보 얻기 연월일시분초
        LocalDateTime localDateTime = LocalDateTime.now(); //LocalDateTime.now(); 이거 먼저 작성 후 지역변수 삽입
        System.out.println(localDateTime);

        //특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println(beginDate);

        //연월일 따로 추출
        int year = localDateTime.getYear();
        System.out.println("year : " + year);

        //문자 형태의 월 리턴(Month 라는 열거형 타입 중 하나)
        Month month = localDateTime.getMonth();
        System.out.println("month " + month);

        //정수 형태의 월 리턴
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        //일 추출
        int dayValue = localDateTime.getMonthValue();
        System.out.println("dayValue = " + dayValue);

        //요일(열거형 타입 리턴)
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek/*.toSring 생략*/);

        makeLine();

        //지금으로부터 3일 뒤
        LocalDateTime d2 = localDateTime.plusDays(3);//hours, minute, month
        System.out.println("d2 = " + d2);

        //지금으로부터 1년 2개월 7일 뒤
        LocalDateTime d3 = localDateTime
                .plusYears(1)
                .plusMonths(2)
                .plusDays(7);//메서드 체인링 : 연계해서 호출
        System.out.println("d3 = " + d3);

        //지금으로부터 9개월 23일 전
        LocalDateTime d4 = localDateTime
                .minusMonths(9)
                .minusDays(23);
        System.out.println("d4 = " + d4);

        //사이 날짜 연산
        LocalDate b = LocalDate.of(2020,12,30);
        LocalDate f = LocalDate.of(2022,9,14);
        long between = ChronoUnit.DAYS.between(b, f);//며칠이 지났는지 확인 //days weeks years
        System.out.println("between = " + between);

        makeLine();

        //날짜 포맷 변경하기
        System.out.println(localDateTime);
        // DateTimeFormatter 객체 생성 -> 원하는 날짜 형태를 서식문자로 표현
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초"); //a hh am1시 //자주씀
        // 준비한 DateTimeFormatter 객체를 format() 매개값으로 전달.
        System.out.println(localDateTime.format(dtf));

    }
}