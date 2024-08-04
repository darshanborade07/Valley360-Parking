package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ParkingAreaDTO;
import com.app.entities.ParkingArea;
import com.app.entities.User;
import com.app.exception.UserNotFoundException;
import com.app.repository.ParkingAreaRepository;
import com.app.repository.UserRepository;

@Service
@Transactional
public class ParkingAreaServiceImpl implements ParkingAreaService {

	@Autowired
	private ParkingAreaRepository parkingAreaRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ParkingArea addParkingArea(ParkingAreaDTO parking) {
		User user = userRepository.findById(parking.getOwnerId())
				.orElseThrow(() -> new UserNotFoundException("Invalid id !!"));
		
		ParkingArea parkingArea = mapper.map(parking, ParkingArea.class);
		
		parkingArea.setUser(user);
			
		return parkingAreaRepository.save(parkingArea);
	}

}
