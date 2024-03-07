package video.movie.service;

import etc.api.lang.obj.Person;
import video.common.AppService;
import video.common.Condition;
import video.movie.domain.Movie;
import video.movie.repository.MovieRepository;
import video.ui.AppUi;

import java.lang.management.MonitorInfo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

//import static video.movie.repository.MovieRepository.deleteMovie;
import static video.ui.AppUi.*;

public class MovieService implements AppService { //ctrl O 오버라이딩 꼭!!!

    private final MovieRepository movieRepository = new MovieRepository();


    @Override
    public void start() {
        while (true) {
            movieManagementScreen();
            int selection = inputInteger(">>>");

            switch (selection) {
                case 1:
                    insertMovieData(); //() 필수
                    break;

                case 2:
                    showSearchMovieData();
                    break;

                case 3:
                    deleteMovieData();
                    break;

                case 4:

                    return;//첫화면 가기

                default:
                    System.out.println("### 메뉴를 다시 입력하세요");

            }
        }
    }


    private void insertMovieData() {
        System.out.println("==== =영화 DVD 정보 추가합니다 =====");
        String movieName = inputString("# 영화명 : ");
        String nation = inputString("# 국가명 : ");
        int putYear = inputInteger("# 발며연도");

        Movie newMovie = new Movie(movieName, nation, putYear);

        movieRepository.addMovie(newMovie);
        System.out.printf("### %s 정보가 정상적으로 차가됨", movieName);
    }

    //영화 검색 정보 출력
    private void showSearchMovieData() {//넘기고 넘기고 넘겨서 여긴 void라 여기서 예외처리(다른 곳은 리턴 타입있어서) //!!!!!!!!!!throws Exception 외 다른 한곳 못함

        try {
            List<Movie> movies = searchMovieData();
            int count = movies.size();
            if (count > 0) {
                System.out.printf("\n======================================= 검색 결과(총 %d건) =======================================\n", count);
                for (Movie movie : movies) {
                    System.out.println(movie);
                }
            } else {
                System.out.println("\n### 검색 결과가 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("\n ### 발행연도는 정수로만 입력하세요.");
        }


    }

    //영화 검색 비즈니스 로직
    private List<Movie> searchMovieData() throws Exception {
        System.out.println("\n============== 영화 DVD 검색 조건을 선택하세요. ===============");
        System.out.println("[ 1. 제목검색 | 2. 국가검색 | 3. 발매연도검색 | 4. 전체검색 ]");
        int selection = inputInteger(">>>");

        Condition condition = Condition.ALL;

        switch (selection) {
            case 1:
                System.out.println("\n## 제목으로 검색합니다.");
                condition = Condition.TITLE;
                break;

            case 2:
                System.out.println("\n## 국가로 검색합니다.");
                condition = Condition.NATION;
                break;


            case 3:
                System.out.println("\n## 발매년도으로 검색합니다.");
                condition = Condition.PUB_YEAR;
                break;


            case 4:
                System.out.println("\n## 전체검색으로 검색합니다.");
                //기본값 ALL이라 따로 지정할 필요 없음
                break;


            default:
                System.out.println("### 해당 메뉴가 없습니다, 전체 정보로 검색합니다.");

        }

        String keyword = ""; //초기값 공백
        if (condition != Condition.ALL) {
            keyword = inputString("# 검색어 : ");
        }
        return movieRepository.searchMovieList(condition, keyword);

    }


    //기존 등록 영화 삭제 기능
    private void deleteMovieData() {
        //List<Movie> movies = new ArrayList<>();
        try {
            System.out.println("\n ### 삭제를 위한 영화 검색을 시작합니다. ");
            List<Movie> movies = searchMovieData();

            if (movies.size() > 0) {
                List<Integer> movieNums = new ArrayList<>();
                for (Movie movie : movies) { //영화 목록 보여주기
                    System.out.println(movie);
                    movieNums.add(movie.getSerialNumber());
                }
                System.out.println("\n### 삭제할 영화의 번호를 입력하세요.");
                int delMovieNum = inputInteger(">>>");

                if (movieNums.contains(delMovieNum)) {
                    Movie delMovie = movieRepository.deleteMovie(delMovieNum);
                    System.out.printf("\n### 영화번호: %d -> %s 영화의 정보를 정상 삭제하였습니다.\n"
                            , delMovie.getSerialNumber(), delMovie.getMovieName());

                } else {
                    System.out.println("\n### 검색된 영화 번호로만 삭제가 가능합니다.");
                }

            } else {
                System.out.println("\n ### 조회 결과가 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("\n ### 발행연도는 정수로만 입력하세요.");
        }
    }
}


//    private void deleteMovieData() {//내가 작성

        /*
        List<Movie> movies = new searchMovie<>();
        if(movies.size() > 0){
            List<Integer> movieNums = new ArrayList<>();

            for(Movie movie : movies){
                System.out.println(movie);
                movieNums.add(movie.getSerialNumber());
            }
            System.out.println("\n 삭제할 영화 번호를 입력하세요");
            int delMovieNum = inputInteger(">>>");

            if(movieNums.contains(delMovieNum)){
                Movie delMovie = deleteMovie.(delMovieNum);
                System.out.printf("\n ### %s[%s] 님이 회원정보가 삭제 되었습니다 \n", delMovie.getMovieName(), delMovie.getMovieName());
            } else {
                System.out.println("\n ### 검색된 영화 번호로만 삭제가 간으합니다.");
            }

        } else{
            System.out.println("\n ### 조회결과가 없습니다.");
        }
    } catch (Exception e){
        System.out.println("\n ### 발행연도는 정수로만 입력하세요.");
    }
    */
