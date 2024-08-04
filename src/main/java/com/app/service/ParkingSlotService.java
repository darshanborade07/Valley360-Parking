package com.app.service;

import com.app.dto.ParkingSlotDTO;
import com.app.entities.ParkingSlot;

public interface ParkingSlotService {

	ParkingSlot addNewParkingSlot(ParkingSlotDTO slot);
}
