package com.anil.boltcab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAvaialable() {
		return isAvaialable;
	}
	public void setAvaialable(boolean isAvaialable) {
		this.isAvaialable = isAvaialable;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	@Id
	private int driverId;
	private String vehicleNumber;
	private String email;
	private String contact;
	private String password;
	private boolean isAvaialable;
	private int xCoordinate;
	private int yCoordinate;
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}		

