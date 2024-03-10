package Subway.repository;


import Subway.domain.Staff;

import java.util.HashMap;
import java.util.Map;

public class SubwayStaffRepository {

    private static final Map<Integer, Staff> staffDatabase  = new HashMap<>();

    static {
        insertStaffData();
    }

    private static void insertStaffData(){
        Staff staff1 = new Staff("Fujiko","Japan","Tokyo",030707,"Piano");
        Staff staff2 = new Staff("Kimiko","Japan","Tokyo",041210,"English");
        Staff staff3 = new Staff("Xuelin","China","Guangzhou",020418,"Drawing");
        Staff staff4 = new Staff("Jeni","Hong Kong","Hong Kong",020912,"Drawing");
    }


}
