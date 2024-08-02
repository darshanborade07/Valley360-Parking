package com.app.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "parking_area")
@Getter
@Setter
@ToString
public class ParkingArea extends BaseEntity{
	
	private String address;
	private double latitude;
	private double longitude;
	private boolean status;
	
	@OneToOne
	@JoinColumn(name = "owner_id")
	private User user;

	@OneToMany(mappedBy = "parking")
	private Set<ParkingSlot> parkingSlots;
	
	public ParkingArea() {
		super();
	}
	
	public ParkingArea(String address, double latitude, double longitude, boolean status) {
		super();
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
	}	
	
	
}
