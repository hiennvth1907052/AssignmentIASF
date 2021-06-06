package com.example.assignmentiasf.dto;

import com.example.assignmentiasf.entity.District;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DistrictDTO {
    private String districtName;
    private List<RoadDTO> roadSet;

    public DistrictDTO(District district) {
        this.districtName = district.getDistrictName();
    }
}
