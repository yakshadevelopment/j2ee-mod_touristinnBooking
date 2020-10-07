package com.touristinn.model;

public class TouristInn {
	private String roomType;
	private Integer availableRooms;
	public TouristInn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TouristInn(String roomType,  Integer availableRooms) {
		super();
		this.roomType = roomType;
		this.availableRooms = availableRooms;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public Integer getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(Integer availableRooms) {
		this.availableRooms = availableRooms;
	}
	

}
