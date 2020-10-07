package com.touristinn.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.touristinn.model.Client;
import com.touristinn.model.TouristInn;

@Service
@Component
public class InnData {
  private static Map<String,TouristInn> innMap=new LinkedHashMap<String,TouristInn>();
  private static Map<Integer,Client> clientMap=new LinkedHashMap<Integer,Client>();
  private static int idgen=0;
  static{
	  innMap.put("SUITE",new TouristInn("SUITE",7));
	  innMap.put("DELUXE",new TouristInn("DELUXE",10));
	  innMap.put("ORDINARY",new TouristInn("ORDINARY",20));
	  innMap.put("DORMITORY",new TouristInn("DORMITORY",25));
  }
  public List<TouristInn> showRoomStatus() {
	 List<TouristInn> innList=new ArrayList<TouristInn>(innMap.values());
	 return innList;
	 
  }
  
  public List<Client> showAllClients() {
		 List<Client> clientList=new ArrayList<Client>(clientMap.values());
		 return clientList;
		 
	  }
  
  public void addNewClient(Client client) {
	  client.setClientId(++idgen);
	  String roomType=client.getRoomType().toUpperCase();
	  int roomBooked=client.getTotalBookedRoom();
	  TouristInn inn=innMap.get(roomType);
	  int available=inn.getAvailableRooms();
	  available=available-roomBooked;
	  inn.setAvailableRooms(available);
	  innMap.remove(roomType);
	  innMap.put(inn.getRoomType(),inn);
	  clientMap.put(client.getClientId(),client);
	 }
  
  public void removeClient(int id){
	  Client client=clientMap.get(id);
	   String roomType=client.getRoomType().toUpperCase();
	  int roomBooked=client.getTotalBookedRoom();
	  TouristInn inn=innMap.get(roomType);
	  int available=inn.getAvailableRooms();
	  available=available+roomBooked;
	  inn.setAvailableRooms(available);
	  innMap.remove(roomType);
	  innMap.put(inn.getRoomType(),inn);
	  clientMap.remove(id);
	 }
}