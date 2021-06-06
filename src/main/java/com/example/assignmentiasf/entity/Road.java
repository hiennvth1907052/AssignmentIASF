package com.example.assignmentiasf.entity;

import com.example.assignmentiasf.dto.RoadDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long foundingDate;
    private String description;
    private int status;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "districtId")
    private District district;

    @Column(insertable = false, updatable = false)
    private int districtId;

    public Road(RoadDTO roadDTO) {
        this.name = roadDTO.getName();
        this.foundingDate = Calendar.getInstance().getTimeInMillis();
        this.description = roadDTO.getDescription();
        this.status = 1;
        this.district = new District();
        this.district.setDistrictName(roadDTO.getDistrictName());
    }

    public String getStatusString () {
        return this.getStatus() == 1 ? "Đang sử dụng" : (this.getStatus() == 0 ? "Đang thi công" : "Đang tu sửa");
    }
}
