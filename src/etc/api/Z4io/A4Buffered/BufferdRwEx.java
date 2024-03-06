//package etc.api.Z4io.A4Buffered;
//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class BufferdRwEx {
//    public static void main(String[] args) {
//
//        StringBuilder text = new StringBuilder();
//
//        for(int i = 0; i < 1000000; i++){
//            text.append(i+ "Halou\n");//반복작업 스트링 빌더가 더 빠름 // 문자열을 맨 끝에 추가하는 메서드 append(문자열)
//        }
//
//        try(FileWriter fw = new FileWriter("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO\\test.txt"));
//        BufferedWriter bw = new BufferedWriter(fw)){ //FileWriter / FileReader
//
//
//        bw.write(new String(text)); //무자 기반 스트림이기 때문에 문자열 그대로 전달.
//        System.out.println("파일 정상 출력 완료");
//
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//
//        try(FileReader fr = new FileReader("C:\\Users\\ICT4_15\\Desktop\\file\\JavaIO.test.txt");
//            BufferedReader br = new BufferedReader(fr)){
//
//            // BufferedReader 에는 readLine() 메서드가 있고
//            // 한 줄을 통째로 읽어서 String으로 리턴
//            // 더 이상 읽어들일 데이터가 없다면 null을 리턴
//            String str;
//            while((str = br.readLine()) != null){
//                //System.out.println(); //기니까 생략
//            }
//            System.out.println("파일 읽기 완료");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
