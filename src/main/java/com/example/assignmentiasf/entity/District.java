package com.example.assignmentiasf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String districtName;
    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Road> roadSet;

    public District(String districtName) {
        this.districtName = districtName;
    }

    public void addRoad(Road road) {
        if (this.roadSet == null) {
            this.roadSet = new HashSet<>();
        }
        this.roadSet.add(road);
    }
}
