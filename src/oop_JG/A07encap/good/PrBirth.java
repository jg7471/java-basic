package oop_JG.A07encap.good;

public class PrBirth {

    private int year;
    private int month;
    private int day;

    public void setYear(int year){
        if(year < 1900 || year > 2024){
            System.out.println("잘못된 연도입니다.");
            return;
        }
        this.year = year;
    }

    public int getYear(String pw){
        if(pw.equals("aaa111")){
            return year;
        } else {
            System.out.println("비밀번호 틀렸습니다");
            return 0;
        }
    }

    public void setMonth(int month){
        if(month > 12 || month < 1){
            System.out.println("잘못된 월입니다");
            return;
        }
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int day){
        if(day > 31 || day <1){
            System.out.println("잘못된 일입니다");
            return;
        } else {
            if(this.month == 0){
                System.out.println("일자를 할당하기 위해서는 월 세팅이 선행되어야 합니다");
                return;
            }

            if(!)

        }


            private boolean isValidDate (int day){
            switch (this month){
                case 2:
                    if(day >29){
                        return false;
                    }
                case 4:
                    if(day >30){
                        return false;
                    }
                default :
                    return true;

            }
        }




    }

}
