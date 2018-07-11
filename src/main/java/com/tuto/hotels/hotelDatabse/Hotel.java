package com.tuto.hotels.hotelDatabse;

public class Hotel {
  
	
	String name;
	String address;
	String city;
	int number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Hotel(String name, String address, String city, int number) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.number = number;
	}
	
}
