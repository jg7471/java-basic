package video.movie.repository;

import video.common.Condition;
import video.movie.domain.Movie;
import video.user.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static video.common.Condition.*;

public class MovieRepository {
    private static final Map<Integer, Movie> movieDatabase = new HashMap<>();

    static {//정적 초기화자 : static map이 실행시 자동 insertTestMovieData 호출
        insertTestMovieData();
    }


    //테스트 데이터 생성 및 삽입
    private static void insertTestMovieData() {
        Movie movie1 = new Movie("인터스텔라", "미국", 2014);
        Movie movie2 = new Movie("포레스트 검프", "미국", 1994);
        Movie movie3 = new Movie("너의 이름은", "일본", 2017);
        Movie movie4 = new Movie("라라랜드", "미국", 2016);
        Movie movie5 = new Movie("레옹", "프랑스", 1994);
        Movie movie6 = new Movie("어바웃 타임", "영국", 2013);
        Movie movie7 = new Movie("타이타닉", "미국", 1998);
        Movie movie8 = new Movie("인생은 아름다워", "이탈리아", 1999);
        Movie movie9 = new Movie("쇼생크 탈출", "미국", 1995);
        Movie movie10 = new Movie("기생충", "대한민국", 2019);

        movieDatabase.put(movie1.getSerialNumber(), movie1);
        movieDatabase.put(movie2.getSerialNumber(), movie2);
        movieDatabase.put(movie3.getSerialNumber(), movie3);
        movieDatabase.put(movie4.getSerialNumber(), movie4);
        movieDatabase.put(movie5.getSerialNumber(), movie5);
        movieDatabase.put(movie6.getSerialNumber(), movie6);
        movieDatabase.put(movie7.getSerialNumber(), movie7);
        movieDatabase.put(movie8.getSerialNumber(), movie8);
        movieDatabase.put(movie9.getSerialNumber(), movie9);
        movieDatabase.put(movie10.getSerialNumber(), movie10);
    }

    public void addMovie(Movie movie) {
        movieDatabase.put(movie.getSerialNumber(), movie);

    }

    public List<Movie> searchMovieList(Condition condition, String keyword) throws Exception {
        if (condition == TITLE) { //import로 불러옴
            return searchByTitle(keyword);

        } else if (condition == NATION) {
            return searchByNation(keyword);

        } else if (condition == Condition.PUB_YEAR) {
            return searchByPubYear(keyword);

        } else {
            return searchAll();
        }
    }

    private List<Movie> searchAll() {
        List<Movie> searchedList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key); //객체 하나씩 가져와서
            searchedList.add(movie); //리스트에 담겠다

        }
        return searchedList;
    }

    //문자열을 숫자로 변환하는 과정에서 예외 발생 가능성이 있기 때문에 throws 추가
    private List<Movie> searchByPubYear(String keyword) throws NumberFormatException {//문자열 입력
        List<Movie> searchedList = new ArrayList<>();

        //입력값을 String으로 받았기 대문에 int로 변환해서 비교
        int targetYear = Integer.parseInt(keyword);//문자열 오류 발생할 수도 있으니 예외 떠넘기기

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key); //객체 하나씩 가져와서
            if (movie.getPubYear() == targetYear) { //변환하여 비교
                searchedList.add(movie); //리스트에 담겠다
            }
        }
        return searchedList;
    }

    //private List<Movie> searchMovieList(Condition condition, String keyword) {} //노필요?


    private List<Movie> searchByNation(String keyword) {
        List<Movie> searchedList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key); //객체 하나씩 가져와서
            if (movie.getNation().equals(keyword)) {
                searchedList.add(movie); //리스트에 담겠다
            }
        }
        return searchedList;
    }

    private List<Movie> searchByTitle(String keyword) {
        List<Movie> searchedList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key); //객체 하나씩 가져와서
            if (movie.getMovieName().equals(keyword)) {
                searchedList.add(movie); //리스트에 담겠다
            }

        }

        return searchedList;
    }

    //내가 작성
    public Movie deleteMovie(int delMovieNum) { //리턴하는거 이해

        return movieDatabase.remove(delMovieNum);
    }

    public List<Movie> searchByRental(boolean possible) { //possible : boolean 값
        List<Movie> searchedList = new ArrayList<>();

        //if(possible == true){
        if(possible){ //대여 가능한 Movie들만 거르기 //요렇게 쓰는게 더 깔끔
            for (int key : movieDatabase.keySet()) {
                Movie movie = movieDatabase.get(key);
                if(!movie.isRental())//boolean 타입 //대여가능
                    searchedList.add(movie);
            }
        } else {
            for (int key : movieDatabase.keySet()) {
                Movie movie = movieDatabase.get(key);
                if(movie.isRental())//boolean 타입 //대여불가
                    searchedList.add(movie);
            }
        }

        return searchedList;
    }

    //번호에 맞는 영화객체를 단 하나만 리턴하는 메서드.
    public Movie searchMovie(int movieNumber){ //movieNumber에 맞는 단 1개의 Moive만 필요
        return movieDatabase.get(movieNumber); //영화 번호가 곧 key
    }

}
