package com.spring.classes;

public class Enrollment {

	private String program;
	private String startDate;
	private double amountPaid;
	private String status;
	
	
	public Enrollment() {
	}


	public Enrollment(String program, String startDate, double amountPaid, String status) {
		super();
		this.program = program;
		this.startDate = startDate;
		this.amountPaid = amountPaid;
		this.status = status;
	}


	public String getProgram() {
		return program;
	}


	public void setProgram(String program) {
		this.program = program;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public double getAmount() {
		return amountPaid;
	}


	public void setAmount(double amount) {
		this.amountPaid = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
}
