package com.example.assignmentiasf.service;

import com.example.assignmentiasf.dto.DistrictDTO;
import com.example.assignmentiasf.entity.District;
import com.example.assignmentiasf.repository.IDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    IDistrictRepository districtRepository;

    public List<District> saveAll(List<District> list){
        return districtRepository.saveAll(list);
    }

    public List<District> getListDistrict(){
        return districtRepository.findAll();
    }
}
