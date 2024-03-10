package Subway.service;

import Subway.repository.SubwayStaffRepository;

public class SubwayMenu {


    private static SubwayStaffRepository ss;
    static{
        ss = new SubwayStaffRepository();
    }

    while(true){
        System.out.println("메뉴를 선택하세요");
    }

}
