package com.app.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.enums.Status;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "parking_area")

public class ParkingArea extends BaseEntity{
	
	private String address;
	private double latitude;
	private double longitude;
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_id")
	private User user;

	@OneToMany(mappedBy = "parking")
	private Set<ParkingSlot> parkingSlots;
	
	public ParkingArea() {
		super();
	}
	
	public ParkingArea(String address, double latitude, double longitude, Status status) {
		super();
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<ParkingSlot> getParkingSlots() {
		return parkingSlots;
	}

	public void setParkingSlots(Set<ParkingSlot> parkingSlots) {
		this.parkingSlots = parkingSlots;
	}	
	
	
}
