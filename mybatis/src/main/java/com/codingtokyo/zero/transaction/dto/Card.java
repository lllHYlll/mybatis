package com.codingtokyo.zero.transaction.dto;

public class Card {
	
	private String consumerId;
	private int amount;
	
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Card [consumerId=" + consumerId + ", amount=" + amount + "]";
	}
	
	
		

}
