package com.touristinn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.touristinn.dao.InnData;
import com.touristinn.model.Client;
import com.touristinn.model.TouristInn;

@Controller
public class TouristInnController {
	
	@Autowired
	   private InnData innData;
	
	@RequestMapping("/start")
	public String openHomePage(Model model) {
		List<TouristInn> roomList = innData.showRoomStatus();
		model.addAttribute("roomList",roomList);
	    return "homePage";
	}
	
	@RequestMapping("/showClients")
	public String openClientPage(Model model) {
		List<Client> clientList = innData.showAllClients();
		model.addAttribute("clientList",clientList);
	    return "clientPage";
	}
	
	@RequestMapping("/RoomCheckIn")
	public String openClientEntryPage(Model model) {
		Client client=new Client();
		model.addAttribute("clientRecord",client);
	    return "roomCheckIn";
	}
	
	@RequestMapping("/saveClient")
	public String saveClientDetails(@ModelAttribute("clientRecord") Client client) {
		innData.addNewClient(client);
		return "redirect:/start";
	}
	
	@RequestMapping("/RoomCheckOut")
	public String openClientCheckOutPage() {
				    return "roomCheckOut";
	}
	
	@RequestMapping("/removeClient")
	public String removeClient(@RequestParam("id")  int id) {
		innData.removeClient(id);
		return "redirect:/start";
	}
	
	
	

}
