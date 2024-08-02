package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "parking_slots")
@Getter
@Setter
@ToString
public class ParkingSlot extends BaseEntity {
	
	private String vehicleType;
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "parking_id")
	private ParkingArea parking;
	
}
