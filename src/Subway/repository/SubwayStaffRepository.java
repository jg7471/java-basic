package Subway.repository;


import Subway.domain.Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubwayStaffRepository {

    private static final Map<Integer, Staff> staffDatabase  = new HashMap<>();

    static {
        insertStaffData();
    }

    private static void insertStaffData(){
        Staff staff1 = new Staff("Kim","Korea","Busan",1207);
        Staff staff2 = new Staff("Shinji","Japan","Tokyo",1210);
        Staff staff3 = new Staff("Lei","China","Guangzhou",1017);
        Staff staff4 = new Staff("GEM","Hong Kong","HongKong",1110);

        staffDatabase.put(staff1.getSerialNumber(), staff1);
        staffDatabase.put(staff2.getSerialNumber(), staff2);
        staffDatabase.put(staff3.getSerialNumber(), staff3);
        staffDatabase.put(staff4.getSerialNumber(), staff4);

    }

    public static List<Staff> searchStaffList(){
        List<Staff> searchedList = new ArrayList<>();
        System.out.println("test결과");
        for(int key : staffDatabase.keySet()){
            Staff staff = staffDatabase.get(key);
            searchedList.add(staff);
                    //searchedList - add (ArrayList)
                    //staffDatabase - get HashMap
        }
        return searchedList;
    }


}
