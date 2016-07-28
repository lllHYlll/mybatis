package com.codingtokyo.zero.transaction.mapper;

import org.springframework.stereotype.Repository;

import com.codingtokyo.zero.transaction.dto.Card;

@Repository
public interface TicketMapper {

	void buyTicket(Card card);

	void ticketResult(Card card);

}
