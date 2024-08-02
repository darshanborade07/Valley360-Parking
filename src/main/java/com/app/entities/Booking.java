package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@ToString
public class Booking extends BaseEntity{

	private LocalDateTime date;
	private String vehicleNo;
	private String VehicleType;
	private int parkingHours;
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "parking_slot_id")
	private ParkingSlot parkingSlot;

	public Booking() {
		super();
	}

	public Booking(LocalDateTime date, String vehicleNo, String vehicleType, int parkingHours, double price) {
		super();
		this.date = date;
		this.vehicleNo = vehicleNo;
		VehicleType = vehicleType;
		this.parkingHours = parkingHours;
		this.price = price;
	}
	
	
}
