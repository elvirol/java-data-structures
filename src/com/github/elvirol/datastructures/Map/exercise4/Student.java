package com.github.elvirol.datastructures.Map.exercise4;

public class Student {
	private String name;
	private String track;
	
	public Student(String name, String track) {
		this.name = name;
		this.track = track;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTrack() {
		return track;
	}
	
	@Override
	public String toString() {
		return name + ": " + track;
	}

}
