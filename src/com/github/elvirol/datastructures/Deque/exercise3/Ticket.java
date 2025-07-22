package com.github.elvirol.datastructures.Deque.exercise3;

import java.sql.Date;
import java.time.Instant;

public class Ticket {
	private String name;
	private boolean isUrgent;
	private long timeStamp;
	
	public Ticket(String name, boolean isUrgent) {
		this.name = name;
		this.isUrgent = isUrgent;
		this.timeStamp = Instant.now().toEpochMilli();
		}
	
	public String getName() {
		return name;
	}
	
	public boolean isUrgent() {
		return isUrgent;
	}
	
	public long getTimeStamp(){
		return timeStamp;
	}
}
