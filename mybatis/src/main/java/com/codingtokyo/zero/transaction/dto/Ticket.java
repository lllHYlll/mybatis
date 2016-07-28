package com.codingtokyo.zero.transaction.dto;

public class Ticket {
	
	private String consumerId;
	private int buyTicket;

	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public int getBuyTicket() {
		return buyTicket;
	}
	public void setBuyTicket(int buyTicket) {
		this.buyTicket = buyTicket;
	}
	
	@Override
	public String toString() {
		return "Ticket [consumerId=" + consumerId + ", buyTicket=" + buyTicket + "]";
	}
	
	
	
	
}
