package song;

import java.util.HashMap;
import java.util.Map;

public class ZMyPractice {

    private static Map<String, Artist>artistList;

    static {
        artistList = new HashMap<>();//HashMap 중복을 허용하지 않고 순서를 보장하지 않는다
    }
    public static Map<String, Artist> getArtistList() {return artistList; }

    public void addNewArtist(String artistName, String songName){
        Artist artist = new Artist
    }

}
