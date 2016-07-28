package com.codingtokyo.zero.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingtokyo.zero.transaction.dto.Card;
import com.codingtokyo.zero.transaction.service.TicketService;

@Controller
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketService;

	@RequestMapping("")
	public String viewTicket(){
		return "/ticket/buyTicket";
	}
	
	@RequestMapping(value = "/resultTicket", method = RequestMethod.POST)
	public ModelAndView resultTicket(@ModelAttribute("ticket")Card card){
		
		System.out.println(card.toString());
		
		ModelAndView mv = new ModelAndView("/ticket/resultTicket");
		
		ticketService.buyTicket(card);
		mv.addObject("ticketInfo", card);
		return mv;
	}
}
