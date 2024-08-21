package com.Triton.LeasePaymentCalculationService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Triton.LeasePaymentCalculationService.entity.RequestWrapper;

@Service
public class LeasePaymentService {

	@Autowired
	private LeasePaymentCalculationService leasePaymentCalculationService;
	
	public ResponseEntity<String>checkSampleEndpoint()
	{
		return new ResponseEntity<>("Lease EndPoint Working" , HttpStatus.OK);
	}

	public ResponseEntity<Double> getLeaseAmount(RequestWrapper requestWrapper) {
		// TODO Auto-generated method stub
		ResponseEntity<Double>result = null;
		
		try
		{
			double leaseAmount = leasePaymentCalculationService.getLeaseAmount(requestWrapper.getLeaseAmount(), requestWrapper.getNumDays());
			result = new ResponseEntity<>(leaseAmount , HttpStatus.OK);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			result = new ResponseEntity<>(0.0 , HttpStatus.BAD_REQUEST);
		}
		
		return result;
	}
	
}
