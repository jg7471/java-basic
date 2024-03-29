package song;

import util.Utility;

import java.io.*;
import java.util.*;

public class ArtistRepository {


    //Key 가수이름, value : Artist 객체,
    private static Map<String, Artist> artistList; //나 같으면 artistMap으로 바꿈 //객체 생성없이(메소드만으로) 접근하게 static으로 but 직접 접근하지 못하게
    // Map<String, String> map = new HashMap<>(); //원랜 요렇게
    //Key / Value
    //private 클래스 내부에서만 사용
    //static 객체 생성없이 사용 가능

    ;//HashMap 중복을 허용하지 않고 순서를 보장하지 않는다
    static { //정적 초기화자 : 정적 멤버는 클래스에 고정된 멤버로, 객체를 생성하지 않고 사용할 수 있다.
        artistList = new HashMap<>(); //외부에서 호출시 사용 : static이라 시작시 바로 초기화
        //2번) artistList static hashMap 호출(1번에서 private으로 설정해서 외부에서 접근이 불가하기 때문에
        // 1번, 2번 이렇게 정적 초기화 하는게 정석인가요? ////이런식으로 많이씀
        //2번에서 static으로 설정하고, HashMap으로 설정)
    }
    //static 클래스에 인스턴스를 생성하지 않고도 사용할 수 있는 멤버이며, 클래스가 로딩될 때 초기화됩니다.

    public static Map<String, Artist> getArtistList() {//테스트용(잘 동작 되는지 테스트)
        return artistList;
    }

    //신규 가수를 map에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {

        //1. 신규 가수 정보 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>()); //artist 객체 생성(Name, 두번째 빈 매개변수 hash)
        // 각 아티스트는 여러 곡을 가질 수 있습니다.
        // 따라서 Artist 객체를 만들 때 아티스트의 곡 목록을 저장하기 위해 HashSet을 생성합니다.

        //2. 생성된 노래 목록을 리턴받아서 노래 이름을 추가
        artist.getSongList().add(songName); //getSongList로 받고 호출
        //add(객체): list, hashSet 객체를 추가하는 메서드
        //songName 를 각각 다르게 세팅한 것?

        //3. 완성된 객체를 Map에 저장
        artistList.put(artistName, artist); //artistList : map, artist(Songlist)
        //put : Map에 데이터를 추가하는 메서드

    }

    //method 순서 상관X

    //가수명을 전달받아 현재 등록된 가수인지의 여부를 리턴하는 기능 //B01
    public boolean isRegisted(String artistName) {
        return artistList.containsKey(artistName); //키값이 있으면 return true 없음 return false
        //containsKey(Object Key): 주어진 키가 있는지의 여부를 확인.
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
        //메서드는 artistName과 songName을 매개변수로 받지만, 실제로는 artistName만 사용하여 artistList에서 해당 가수를 찾습니다.
        //Map에서 기존 가수 객체부터 찾자
        Artist artist = artistList.get(artistName);//key값 //artistList(HashMap) value 값은? key만 따로 입력 가능한가요? ->키를 통해 밸류를 꺼내는 메서드 get 입니다. 키만 주면 됩니다
        //get(Key) //맵은 인덱스가 없어 , value가 딸려 나옴
        //Set의 add는 add의 실행 결과를 boolean으로 리턴-> 중복이 발생했다면 객체가 추가되지 않고 false를 리턴
        boolean flag = artist.getSongList().add(songName);//addNewArtist() 메소드임
        //add : boolean type 리턴 可 : 성공 true, 중복 false
        //return : boolean 지역변수 삽입
        return flag;
    }

    //노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) { //이거 왜 ArtistView-> 여기로 생성된거지 @@ -> static ar = ArtistView 니까
        Artist artist = artistList.get(artistName);//@@artistList HashMap인데 value값은 없나요?? 키를 통해 밸류를 꺼내는 메서드 get 입니다. 키만 주면 됩니다
        // artistList : map //get(인덱스) : 리스트 내부의 객체를 참조//내가 작성/
        //artistList Map<String(가수이름 key), Artist(객체, value)>
        //System.out.println(artist); //내가 작성

        Set<String> songList = artist.getSongList(); //정렬X set<->ArrayList 전환 편함
        List<String> songs = new ArrayList<>(songList); //배열과 유사한 형태 //'songList라는 컬렉션을 복사하여 새로운 ArrayList에 저장하는 코드입니다.
        //(songList) 생성자 호출 시에 사용되는 표현 //ArrayList 객체를 생성할 때 초기값으로 songList를 사용하겠다는 의미
        for (int i = 0; i < songs.size(); i++) {
            System.out.printf("* %d. %s\n", i + 1, songs.get(i));//List song의 (i)번 get
        }
    }

    //세이브 파일 로드
    public void saveData() {
        // 폴더 경로는 Utility 클래스에 상수로 선언되어 있음.
        // 폴더가 실존하지 않는 경우 생성을 하고 세이브 파일을 생성해야 합니다.
        // 파일명은 song.sav로 진행합니다.

        File f = new File(Utility.FILE_PATH); //폴더 생성
        if (!f.exists()) f.mkdirs();

        //내가 작성
        try (FileOutputStream fos = new FileOutputStream(Utility.FILE_PATH + "/song.sav")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadData() {
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

