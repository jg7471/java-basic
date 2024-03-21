package Subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String bread;
    private String meats;
    private int vegetables;
    private String sauce;

    public Menu(String bread, String meats, int vegetables, String sauce) {
        this.bread = bread;
        this.meats = meats;
        this.vegetables = vegetables;
        this.sauce = sauce;
    }




    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public int getVegetables() {
        return vegetables;
    }

    public void setVegetables(int vegetables) {
        this.vegetables = vegetables;
    }

    public static void refrigerator(){
        List<String> vegRefrigerator = new ArrayList<>();
        vegRefrigerator.add("0 양상추");
        vegRefrigerator.add("1 토마토");
        vegRefrigerator.add("2 오이");
        vegRefrigerator.add("3 피망");
        vegRefrigerator.add("4 양파");
        vegRefrigerator.add("5 피클");
        vegRefrigerator.add("6 올리브");
        vegRefrigerator.add("7 할라피뇨");
        vegRefrigerator.add("8 모든야채제외");
        vegRefrigerator.add("9 선택완료");
    }


    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }



}
