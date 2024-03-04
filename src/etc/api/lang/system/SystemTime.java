package etc.api.lang.system;

public class SystemTime {
    public static void main(String[] args) {

        /*
        System 클래스가 제공하는 currentTimeMillis()는
        1970년 1월 1일 자정을 기준으로 현재까지 소요된 시간을
        밀리초 (1/1000)로 변환한 long타입의 정수를 반환합니다.
        */

        System.out.println(System.currentTimeMillis()); //1709189436.620 : 1970년 기준 mm초

        long start = System.currentTimeMillis();

        int total = 0;
        for(long i = 1; i < 2000000000L; i++){ //200억번 long i =200L 처리 소요시간
            total += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("실행 소요 시간:"+ (end-start)*0.001+"초"); //mm초

        //시스템 메서드 쓸 일 없음
        System.out.println(System.getProperties()); //시스템 속성(System Properties)을 반환합니다
        System.out.println(System.getenv()); //환경정보



    }
}