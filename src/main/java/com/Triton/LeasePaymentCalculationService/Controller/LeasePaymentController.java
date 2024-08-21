package com.Triton.LeasePaymentCalculationService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Triton.LeasePaymentCalculationService.Service.LeasePaymentService;
import com.Triton.LeasePaymentCalculationService.entity.RequestWrapper;

@RestController
@RequestMapping("/CarLeaseIssuing")
public class LeasePaymentController {

	@Autowired
	private LeasePaymentService leasePaymentService;
	
	@GetMapping("/checkSampleEndPoint")
	public ResponseEntity<String>checkSampleEndPoint()
	{
		return leasePaymentService.checkSampleEndpoint();
	}
	
	@PostMapping("/CalculateTotalLease")
	public ResponseEntity<Double>getLeaseAmount(@RequestBody RequestWrapper requestWrapper)
	{
		return leasePaymentService.getLeaseAmount(requestWrapper);
	}
	
}
