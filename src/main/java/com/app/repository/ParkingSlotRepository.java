package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.ParkingSlot;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {

}
