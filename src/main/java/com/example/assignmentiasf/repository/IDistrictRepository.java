package com.example.assignmentiasf.repository;

import com.example.assignmentiasf.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDistrictRepository extends JpaRepository<District, Integer> {
    District findById(int districtId);
}
