package com.Triton.LeasePaymentCalculationService.Service;

import org.springframework.stereotype.Service;

@Service
public class LeasePaymentCalculationService {

	public LeasePaymentCalculationService()
	{
		super();
	}
	
	public double getLeaseAmount(double leasePerDay , int numDays)
	{
		double leaseAmount = leasePerDay * numDays;
		return leaseAmount;
	}
	
}
