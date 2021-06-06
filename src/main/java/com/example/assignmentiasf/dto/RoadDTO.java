package com.example.assignmentiasf.dto;

import com.example.assignmentiasf.entity.Road;
import com.example.assignmentiasf.util.DateTimeUtil;
import com.example.assignmentiasf.util.StatusToStringUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoadDTO {
    private String name;
    private String foundingDate;
    private String description;
    private String status;
    private String districtName;
    private int districtId;

    public RoadDTO(Road road){
        this.name = road.getName();
        this.foundingDate = DateTimeUtil.convertLongToString(road.getFoundingDate());
        this.description = road.getDescription();
        this.status = StatusToStringUtil.getStatusString(road.getStatus());
        this.districtId = road.getDistrictId();
        this.districtName = road.getDistrict().getDistrictName();
    }

    public RoadDTO(String name, long foundingDate, String description, int status, String districtName, int districtId) {
        this.name = name;
        this.foundingDate = DateTimeUtil.convertLongToString(foundingDate);
        this.description = description;
        this.status = StatusToStringUtil.getStatusString(status);
        this.districtName = districtName;
        this.districtId = districtId;
    }
}
