package com.codingtokyo.zero.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingtokyo.zero.transaction.dto.Card;
import com.codingtokyo.zero.transaction.mapper.TicketMapper;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketMapper ticketMapper;
	
	@Override
	public void buyTicket(Card card) {
		
		ticketMapper.buyTicket(card);
		ticketMapper.ticketResult(card);
	}

}
