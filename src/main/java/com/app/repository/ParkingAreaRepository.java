package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.ParkingArea;

public interface ParkingAreaRepository extends JpaRepository<ParkingArea, Long> {

}
