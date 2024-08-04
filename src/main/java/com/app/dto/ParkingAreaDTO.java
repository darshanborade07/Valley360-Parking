package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParkingAreaDTO extends BaseDTO{

	private String address;
	private double latitude;
	private double longitude;
	private boolean status;
	@JsonProperty(access = Access.WRITE_ONLY)
	private Long ownerId;
}
