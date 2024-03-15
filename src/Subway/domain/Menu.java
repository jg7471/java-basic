package Subway.domain;

public class Menu {

    private String bread;
    private String meats;
    private String vegetables;
    private String sauce;

    public Menu(String bread, String meats, String vegetables, String sauce) {
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

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }


}
