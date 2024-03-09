package song;

import java.io.Serializable;
import java.util.Set;

public class Artist implements Serializable { //데이터 아티스트 객체 파일로 망가지지 않고 추출됨
//객체를 스트림으로 전송하려면 직렬화 1번)가 가능해야 합니다.
//직렬화(serialize): 자바 언어에서 사용되는 Object 또는 Data를 다른 환경의 자바에서도 사용할 수 있도록
//바이트 형태의 연속적인 데이터로 변환하는 기술
//윈도우에서 (파일의 손상없이)추출 -> 다른 자바환경(리눅스 mac 등등)



    //객체생성이라 main 존재 X
    private String name; //가수명
    private Set<String> songList; //노래목록 //Set 컬렉션은 저장 순서를 보장하지 않으며 객체의 중복 저장을 허용 X

    //기본 생성자 있는게 좋음
    public Artist(String name, Set<String> songList) { //songList HashMap 입력 : 한가수 여러 곡
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

     @Override
     public String toString() {
         return "Artist{" +
                 "name='" + name + '\'' +
                 ", songList=" + songList +
                 '}';
     }
}
