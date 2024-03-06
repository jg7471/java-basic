package song;

import util.Utility;

import java.io.*;
import java.util.*;

public class ArtistRepository {

    //Key 가수이름, value : Artist 객체
    private static Map<String, Artist> artistList; //객체 생성없이(메소드만으로) 접근하게 static으로 but 직접 접근하지 못하게

    static {
        artistList = new HashMap<>();
    }

    public static Map<String, Artist> getArtistList() {//테스트용(잘 동작 되는지 테스트)
        return artistList;
    }

    //신규 가수를 map에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {
        //1. 신규 가수 정보 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>());
        //2. 생성된 노래 목록을 리턴받아서 노래 이름을 추가
        artist.getSongList().add(songName); //set을 get으로 받고 호출
        //3. 완성된 객체를 Map에 저장
        artistList.put(artistName, artist);
    }

    //method 순서 상관X

    //가수명을 전달받아 현재 등록된 가수인지의 여부를 리턴하는 기능 //B01
    public boolean isRegisted(String artistName) {
        return artistList.containsKey(artistName); //키값이 있으면 return true 없음 return false
    }

    /**
     * /** enter api 문서생성용 주석 : 옆에 아이콘 누르면 작아짐
     * 기존 가수 정보에 노래만 추가하는 기능
     *
     * @param artistName - 사용자의 입력 가수 이름
     * @param songName   - 사용자의 입력 노래 이름
     * @return - 곡명이 중복되었다면 false, 곡이 정상적으로 추가되었다면 true
     */
    public boolean addNewSong(String artistName, String songName) { //객체를 찾기 위해 artistName 필요 -> 실제 입력은 songName //boolean 중복 검사하기 위해
        //Map에서 기존 가수 객체부터 찾자
        Artist artist = artistList.get(artistName);//key값
        //Set의 add는 add의 실행 결과를 boolean으로 리턴-> 중복이 발생했다면 객체가 추가되지 않고 false를 리턴
        boolean flag = artist.getSongList().add(songName);//add : boolean type 리턴 可 : 중복되면 false return : boolean 지역변수 삽입
        return flag;
    }

    //노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) { //이거 왜 ArtistView-> 여기로 생성된거지 @@@
        Artist artist = artistList.get(artistName); //내가 작성
        //System.out.println(artist); //내가 작성
        Set<String> songList = artist.getSongList();
        List<String> song = new ArrayList<>(songList);

        for (int i = 0; i < song.size(); i++) {
            System.out.printf("*%d. %d\n", i + 1, song.get(i));
        }
    }

    //세이브 파일 로드
    public void saveData() {
        // 폴더 경로는 Utility 클래스에 상수로 선언되어 있음.
        // 폴더가 실존하지 않는 경우 생성을 하고 세이브 파일을 생성해야 합니다.
        // 파일명은 song.sav로 진행합니다.

        File f = new File(Utility.FILE_PATH); //폴더 생성
        if (!f.exists()) f.C();

        //내가 작성
        try (FileOutputStream fos = new FileOutputStream(Utility.FILE_PATH + "/song.sav")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        public void loadData () {
            // 세이브 파일이 존재하는지부터 체크합니다.
            // 존재한다면 로드를 진행해서 artistList에 할당(대입)합니다

            File f = new File(Utility.FILE_PATH + "/song.sav");
            if (f.exists()) {
                try (FileInputStream fis = new FileInputStream(Utility.FILE_PATH + "/song.sav")) {
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    artistList = (Map<String, Artist>) ois.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("\n# 로드할 세이브 파일 없음!");
            }


        }

    }
}
