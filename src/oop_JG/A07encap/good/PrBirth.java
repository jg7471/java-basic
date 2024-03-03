package oop_JG.A07encap.good;

import javax.lang.model.SourceVersion;

public class PrBirth {

    private int year;
    private int month;
    private int day;

    public void setYear(int year){
        if(year<1900 || year > 2024){
            System.out.println("XX");
            return;
        }
        this.year = year;
    }

    public int getYear(String pw){
        if(pw.equals(("aaa123"))){
            return year;
        } else {
            System.out.println("XXX");
            return 0;
        }
    }

    public void setMonth(int month){
        if(month > 12 || month < 1){
            System.out.println("잘못된 월");
            return;
        }
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int day){
        if(31 > day || day < 0){
            System.out.println("잘못된 값입니다");
            return;
        }else {
            if(this.month == 0){
                System.out.println("월 입력해주세여");
                return;
            }
            if (!isValidateMonth(day)) {
                System.out.println("정확한 월을 입력해주세요");
                return;
            }
        }
        this.day = day;
    }


    public boolean isValidateMonth(int day){
        switch (this.month){
            case 2:
                if(day > 28){
                    return false;
                }
            case 3: case 6:
                if(day > 30){
                    return false;
                }
            default:
                return true;
        }
    }

    public void birthdayinfo(){
        if(this.year == 0 || this.month == 0 || this.day == 0){
            System.out.println("초기화 되지 않은 값이 있읍니다 ");
            return;
        }
        System.out.printf("%d%d%d",this.year, this.month, this.day);
    }














}
