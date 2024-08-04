package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ParkingSlotDTO;
import com.app.entities.ParkingArea;
import com.app.entities.ParkingSlot;
import com.app.exception.UserNotFoundException;
import com.app.repository.ParkingAreaRepository;
import com.app.repository.ParkingSlotRepository;

@Service
@Transactional
public class ParkingSlotServiceImpl implements ParkingSlotService {

	@Autowired
	private ParkingSlotRepository parkingSlotRepository;
	
	@Autowired
	private ParkingAreaRepository parkingAreaRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ParkingSlot addNewParkingSlot(ParkingSlotDTO slot) {
		ParkingArea area = parkingAreaRepository.findById(slot.getParkingId())
				.orElseThrow(() -> new UserNotFoundException("Invalid id !!"));
		
		ParkingSlot parkingSlot = mapper.map(slot, ParkingSlot.class);
		
		parkingSlot.setParking(area);
		
		return parkingSlotRepository.save(parkingSlot);
	}

}
