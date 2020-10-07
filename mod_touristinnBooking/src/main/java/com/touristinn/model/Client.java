package com.touristinn.model;

public class Client {
	private Integer clientId;
	private String roomType;
	private Integer totalBookedRoom;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Integer clientId, String roomType, Integer totalBookedRoom) {
		super();
		this.clientId = clientId;
		this.roomType = roomType;
		this.totalBookedRoom = totalBookedRoom;
	
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Integer getTotalBookedRoom() {
		return totalBookedRoom;
	}
	public void setTotalBookedRoom(Integer totalBookedRoom) {
		this.totalBookedRoom = totalBookedRoom;
	}
	

}
