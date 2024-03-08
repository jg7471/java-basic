package video.main;

import video.common.AppService;
import video.movie.service.MovieService;
import video.order.service.OrderService;
import video.user.service.UserService;

public class AppController {

    private AppService service; //인터페이스 호출

    //선택한 메뉴에 따라 시스템을 정해주는 기능
    public void chooseSystem(int selectNumber) {
        switch (selectNumber) {
            case 1:
                service = new UserService(); //인터페이스 추상메소드 1
                break;

            case 2:
                service = new OrderService();
                break;

            case 3:
                service = new MovieService();
                break;

            case 4:
                System.out.println("프로그램 종료");
                System.exit(0);

            default:
                System.out.println("#존재하지 않는 메뉴입니다.");

        }

        try { //8번 입력시 비정상 종료 -> 예외 처리
            service.start();//reurn1 끝
        } catch (Exception e) {
            System.out.println("#메뉴를 다시 입력하세요");;
        }

    }
}
