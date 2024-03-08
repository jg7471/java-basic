//package song;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//
//public class ZMyPractice {
//
//    private static Map<String, Artist> artistList; // map 생성
//
//    static {
//        artistList = new HashMap<>();
//    }
//
//    public static Map<String, Artist> getArtistList() {
//        return artistList;
//    }
//
//    public void addNewArtist(String artistName, String SongName) {
//        Artist artist = new Artist(artistName, new HashSet<>());
//        artist.getSongList().add(SongName);
//        artistList.put(artistName, artist);
//    }
//
//    public boolean addNewSong(String artistName, String songName) {
//        Artist artist = artistList.get(artistName);
//        boolean flag = artist.artist.getSongList().add(songName);
//        return flag;
//    }
//
//
//}
