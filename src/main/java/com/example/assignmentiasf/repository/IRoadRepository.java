package com.example.assignmentiasf.repository;

import com.example.assignmentiasf.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoadRepository extends JpaRepository<Road, Integer> {
    List<Road> findRoadByNameContainsAndDistrictId(String keyword, int districtId);
}
