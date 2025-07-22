package com.github.elvirol.datastructures.Deque.exercise3;

import java.util.ArrayDeque;
import java.util.Deque;

public class TicketQueueManager {
	private Deque<Ticket> deque;
	
	public TicketQueueManager() {
		this.deque = new ArrayDeque<>();
	}
	
	public Deque<Ticket> getDequeu() {
		return deque;
	}
	
	public void addTicket(Ticket ticket) {
		if(ticket == null) {
			throw new IllegalArgumentException("Ticket cannot be null");
		}
		
		if(ticket.isUrgent()) {
			deque.addFirst(ticket);
		}else {
			deque.addLast(ticket);
		}
	}
	
	public Ticket nextTicket() {
		return deque.pollFirst();
	}
}
