package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User extends BaseEntity {
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String contact;
	private String gender;
	private String address;

	@OneToOne
	@JoinColumn(name = "role_id",nullable = false)
	private Role role;

	public User() {
		super();
	}

	public User(String email, String password, String firstName, String lastName, String contact, String gender,
			String address) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.gender = gender;
		this.address = address;
	}

	

}