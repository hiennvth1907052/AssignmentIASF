package com.example.assignmentiasf.controller;

import com.example.assignmentiasf.dto.RoadDTO;
import com.example.assignmentiasf.entity.Road;
import com.example.assignmentiasf.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/road")
public class RoadController {
    @Autowired
    private RoadService roadService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public RoadDTO create(@RequestBody RoadDTO roadDTO){
        Road road = roadService.createRoad(roadDTO);
        return new RoadDTO(road);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RoadDTO> getList(){
        return roadService.getList().stream().map(x -> new RoadDTO(x)).collect(Collectors.toList());
    }

    @RequestMapping(value = "/Search", method = RequestMethod.GET)
    public List<RoadDTO> getListRoad(@RequestParam(defaultValue = "") String keyword, @RequestParam(defaultValue = "-1") int districtId){
        return roadService.getListRoad(keyword, districtId).stream().map(x -> new RoadDTO(x)).collect(Collectors.toList());
    }
}
