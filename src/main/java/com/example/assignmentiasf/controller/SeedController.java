package com.example.assignmentiasf.controller;

import com.example.assignmentiasf.dto.RoadDTO;
import com.example.assignmentiasf.entity.District;
import com.example.assignmentiasf.entity.Road;
import com.example.assignmentiasf.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/seed/generate")
public class SeedController {
    @Autowired
    DistrictService districtService;

    @RequestMapping(method = RequestMethod.GET)
    public List<District> saveSeed(){
        District district1 = new District("Hoàn Kiếm");
        district1.addRoad(new Road(new RoadDTO("Tràng Thi", Calendar.getInstance().getTimeInMillis(), "Đường 1 chiều", 1, district1.getDistrictName(), district1.getId())));
        district1.addRoad(new Road(new RoadDTO("Lê Thái Tổ", Calendar.getInstance().getTimeInMillis(), "Đường 1 chiều", 1, district1.getDistrictName(), district1.getId())));

        District district2 = new District("Cầu Giấy");
        district2.addRoad(new Road(new RoadDTO("Xuân Thủy", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));
        district2.addRoad(new Road(new RoadDTO("Trần Duy Hưng", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));

        District district3 = new District("Đống Đa");
        district3.addRoad(new Road(new RoadDTO("Cát Linh", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));
        district3.addRoad(new Road(new RoadDTO("Khâm Thiên", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));

        District district4 = new District("Ba Đình");
        district4.addRoad(new Road(new RoadDTO("Kim Mã", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));
        district4.addRoad(new Road(new RoadDTO("Liễu Giai", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));

        District district5 = new District("Hai Bà Trưng");
        district5.addRoad(new Road(new RoadDTO("Đại Cồ Việt", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));
        district5.addRoad(new Road(new RoadDTO("Bạch Mai", Calendar.getInstance().getTimeInMillis(), "Đường 2 chiều", 1, district1.getDistrictName(), district1.getId())));

        List<District> districts = Arrays.asList(district1, district2, district3, district4, district5);
        return districtService.saveAll(districts);
    }
}
