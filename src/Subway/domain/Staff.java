package Subway.domain;

public class Staff {

    private static int staffSequence;

    private int serialNumber;
    private String Name;
    private String nation;
    private String hometown;
    private int birthDay;



    public Staff(String name, String nation, String hometown, int birthDay) {
        this.serialNumber = ++staffSequence;
        this.Name = name;
        this.nation = nation;
        this.hometown = hometown;
        this.birthDay = birthDay;



    }

    @Override
    public String toString() {
        return "Staff{" +
               serialNumber +
                ", Name='" + Name + '\'' +
                ", nation='" + nation + '\'' +
                ", hometown='" + hometown + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }





}
