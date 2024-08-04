package com.app.service;

import com.app.dto.ParkingAreaDTO;
import com.app.entities.ParkingArea;

public interface ParkingAreaService {
	
	ParkingArea addParkingArea(ParkingAreaDTO parking);
}
