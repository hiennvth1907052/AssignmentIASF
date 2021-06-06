package com.example.assignmentiasf.service;

import com.example.assignmentiasf.dto.RoadDTO;
import com.example.assignmentiasf.entity.District;
import com.example.assignmentiasf.entity.Road;
import com.example.assignmentiasf.repository.IRoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadService {
    @Autowired
    private IRoadRepository iRoadRepository;

    public Road createRoad(RoadDTO roadDTO){
        Road road = new Road(roadDTO);
        District district = new District();
        district.setDistrictName(road.getDistrict().getDistrictName());
        road.setDistrict(district);
        return iRoadRepository.save(road);
    }

    public List<Road> getList(){
        return iRoadRepository.findAll();
    }

    public List<Road> getListRoad(String keyword, int districtId){
        return iRoadRepository.findRoadByNameContainsAndDistrictId(keyword, districtId);
    }
}
