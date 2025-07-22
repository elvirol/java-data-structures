package com.github.elvirol.datastructures.Map.exercise7;

public class Employee {
	private String position;
	private int salary;
	
	public Employee(String position, int salary) {
		this.position = position;
		this.salary = salary;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return " Position: " + position + " Salary: " + salary;
	}

}
