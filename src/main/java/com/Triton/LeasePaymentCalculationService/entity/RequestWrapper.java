package com.Triton.LeasePaymentCalculationService.entity;

public class RequestWrapper {
	
	private double leaseAmount;
	private int numDays;
	
	public RequestWrapper()
	{
		super();
	}
	
	public RequestWrapper(double leaseAmount , int numDays)
	{
		this.leaseAmount = leaseAmount;
		this.numDays = numDays;
	}

	public double getLeaseAmount() {
		return leaseAmount;
	}

	public void setLeaseAmount(double leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
	
	
	
}
