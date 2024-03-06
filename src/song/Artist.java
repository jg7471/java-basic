package song;

import java.io.Serializable;
import java.util.Set;

public class Artist implements Serializable { //데이터 아티스트 객체 파일로 망가지지 않고 추출됨








    //객체생성이라 main 존재 X
    private String name; //가수명
    private Set<String> songList; //노래목록

    //기본 생성자 있는게 좋음


    public Artist(String name, Set<String> songList) { //이거 왜 @@@ 인강
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
