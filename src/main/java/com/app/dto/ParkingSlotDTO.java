package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParkingSlotDTO extends BaseDTO {

	private String vehicleType;
	private boolean status;
	private double price;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long parkingId;
}
