package com.app.service;

import java.util.List;

import com.app.dto.ParkingAreaDTO;
import com.app.entities.ParkingArea;

public interface ParkingAreaService {
	
	ParkingArea addParkingArea(ParkingAreaDTO parking);
	
	List<ParkingAreaDTO> findNearbyParking(double lon, double lat, double radius);
}
