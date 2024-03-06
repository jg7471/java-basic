package etc.api.collection.set;

import java.util.HashSet;
import java.util.Set;

public class A2LottoSimulatorMY {

    static Random r = new Ramdom(); //랜덤 객체 생성

    public static int prize1 = 0;
    public static int prize2 = 0;
    public static int prize3 = 0;
    public static int prize4 = 0;
    public static int prize5 = 0;
    public static int a = 0;



    public static Set<Integer> createLotto(){ //매개변수 X

        System.out.println();

        Set<Integer> lotto = new HashSet<>();
        while(lotto.size() < 6){
            int num = r.nextInt(45) + 1;
            lotto.add(num);
        }
        return lotto;
    }

    public static int createBonusNum(Set<Integer>win){
        while(true){
            int bonus = r.nextInt(45)+1;
            if(!win.contains(bonus)){
                return bonus;
            }
        }
    }

    public static void checkLottoNumber(Set<Integer> win, Set<Integer> myLotto, int bonus){

        int count = 0;
        for(int n : myLotto){
            if(win.contains(n)) count++;
        }

        if(count == 6) prize1++;
        else if(count == 5){
            if(myLotto.contains(bonus)) prize2++;
            else prize3++;
        } else if (count == 4 ) prize4++;
        else if (count == 3 ) prize5++;
        else failCnt++;
    }


    public static void main(String[] args) {

        /*
         - 1~45 범위의 난수 6개를 생성하셔서
          컬렉션 자료형에 모아서 리턴해 주세요.
          무엇을 쓰든 상관하지 않겠습니다.
          중복이 발생하면 안됩니다.
        */

        Set<Integer> win = createLotto();
        int bonus = createBonusNum(win);

        int paper = 0;
        long cost = 0;

        while(true){
            Set<Integer> myLotto = createLotto();
            paper++; cost += 1000;

            checkLottoNumber(win, myLotto, bonus);

            if(prize1 == 1){
                System.out.println("1emd");
                break;
            }else{
                System.out.println("로또"+paper+"구매중");
            }

        }





        /* 내가 작성
        List<Integer> LottoList = new ArrayList<>();
        int r = (int) (Math.random()*45 + 1);
        System.out.println(r);
        Collections.addAll(LottoList,r);
        */


    }
}
