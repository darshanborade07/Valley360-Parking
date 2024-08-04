package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ParkingAreaDTO;
import com.app.service.ParkingAreaService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ParkingAreaController {

	@Autowired
	private ParkingAreaService parkingAreaService;
	
	@PostMapping
	public ResponseEntity<?> addParkingArea(@RequestBody ParkingAreaDTO parking){
		parkingAreaService.addParkingArea(parking);
		return ResponseEntity.status(HttpStatus.CREATED).body("Parking area added !!");
	}
	
}
