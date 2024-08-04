package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ParkingSlotDTO;
import com.app.service.ParkingSlotService;

@RestController
@RequestMapping
@CrossOrigin("*")
public class ParkingSlotController {

	@Autowired
	private ParkingSlotService parkingSlotService;
	
	@PostMapping
	public ResponseEntity<?> addParkingSlot(@RequestBody ParkingSlotDTO parkingSlot){
		parkingSlotService.addNewParkingSlot(parkingSlot);
		return ResponseEntity.status(HttpStatus.CREATED).body("Parking slot added !!");
	}
	
}
