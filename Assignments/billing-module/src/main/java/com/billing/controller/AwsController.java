package com.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.billing.entity.Aws;
import com.billing.service.AwsService;

@RestController
@RequestMapping("/api/aws")
public class AwsController {

	@Autowired
	private AwsService awsService;

//	@GetMapping("/month")
//	public ResponseEntity<List<Aws>> getBillingDetailsForDuration(@RequestParam(name = "months") int months) {
//		List<Aws> billingDetails = awsService.getBillingDetailsForDuration(months);
//		return new ResponseEntity<>(billingDetails, HttpStatus.OK);
//	}

	@GetMapping("/data/count")
	public Long getDataCount() {
		return awsService.getCountOfData();
	}
	
	@GetMapping("/startdate")
	public ResponseEntity<List<Aws>> detBillingByStartDate(@RequestParam String startDate) {
		List<Aws> billingDetails = awsService.getBillingByStartDate(startDate);
		return new ResponseEntity<>(billingDetails, HttpStatus.OK);
	}
	
	@GetMapping("/service")
	public ResponseEntity<List<Aws>> detBillingByService(@RequestParam String service) {
		List<Aws> billingDetails = awsService.getBillingByService(service);
		return new ResponseEntity<>(billingDetails, HttpStatus.OK);
	}
	
	@GetMapping("/getData")
    public List<Aws> getDataByServiceBetweenDates(
            @RequestParam String service,
            @RequestParam String startDate,
            @RequestParam String endDate
    ) {
        return awsService.findDataByServiceBetweenDates(service, startDate, endDate);
    }
	
	@GetMapping("/getDataBetweenDates")
    public List<Aws> getDataBetweenStartAndEndDate(
            @RequestParam String startDate,
            @RequestParam String endDate
    ) {
        return awsService.findDataBetweenStartAndEndDate(startDate, endDate);
    }
}