package etc.api.Z4io.A5Obj;
import java.io.Serializable; /*1)*/

//객체를 스트림으로 전송하려면 직렬화 1번)가 가능해야 합니다.
//직렬화(serialize): 자바 언어에서 사용되는 Object 또는 Data를 다른 환경의 자바에서도 사용할 수 있도록
//바이트 형태의 연속적인 데이터로 변환하는 기술
//윈도우에서 (파일의 손상없이)추출 -> 다른 자바환경(리눅스 mac 등등)
public class Snack implements Serializable /*1번)*/ {

    public enum Taste{ //class 내부 enum 타입 선언
        GOOD, BAD, SOSO
    }


    //객체생성하기 위해 main 작성 X
    private String snackName;
    private int year; //출시연도
    private int price; //가격
    private Taste taste; //맛 //enum Taste 타입으로 변경해야 함

    public Snack(String snackName, int year, int price, Taste taste/*enum Taste의 taste*/) {//생성자 생성 //@@@ 기본 생성자 언급한 부분
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }


    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    } //enum Taste

    public void setTaste(Taste taste) {
        this.taste = taste;
    } //enum Taste


    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }

}
