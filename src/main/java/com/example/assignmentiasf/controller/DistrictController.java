package com.example.assignmentiasf.controller;

import com.example.assignmentiasf.dto.DistrictDTO;
import com.example.assignmentiasf.entity.District;
import com.example.assignmentiasf.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/district")
public class DistrictController {
    @Autowired
    DistrictService districtService;

    @RequestMapping(method = RequestMethod.GET)
    public List<DistrictDTO> listDistrict(){
        return districtService.getListDistrict().stream().map(x -> new DistrictDTO(x)).collect(Collectors.toList());
    }
}
