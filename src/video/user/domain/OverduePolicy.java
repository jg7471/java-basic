package video.user.domain;

import video.order.domain.Order;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OverduePolicy {

    private static final int BASE_OVERDUE_CHARGE = 300; //이 클래스, 고정값, 불변 = 상수
    //이름만 빌려주는 클래스 : 인터페이스로 작성해도 됨

    //연체 일자 계산
    public static int calculateOverdueDay(Order order) {
        LocalDate now = LocalDate.now();
        LocalDate returnDate = order.getReturnDate(); //대여 주문 당시 세팅된 반납 날짜.

        if (returnDate.isBefore(now)) {// 반납 날짜가 오늘보다 이르다 -> 반납이 늦음(연체료) // isBefore 이전 날짜 메소드
            return (int) ChronoUnit.DAYS.between(returnDate, now); //며칠이 지났는지 확인 //between long타입-> 1) 형변환 2) int calculateOverdueDay를 long으로 변환// 21억(int)보다 큰 수 올 수도 있어서
        }//ChronoUnit 시간 차이 구할 때 ChronoUnit.YEARS
        return 0;
    }

    //연체료 계산
    public static int calculateOverdueCharge(Order order) {
        int overdueDay = calculateOverdueDay(order); //자기가 부른 order
        return overdueDay * BASE_OVERDUE_CHARGE;
    }

}
