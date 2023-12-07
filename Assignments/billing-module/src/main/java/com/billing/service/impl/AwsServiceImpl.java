package com.billing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.entity.Aws;
import com.billing.repository.AwsRepository;
import com.billing.service.AwsService;


@Service
public class AwsServiceImpl implements AwsService {

	@Autowired
	private AwsRepository awsRepository;

//	@Override
//	public List<Aws> getBillingDetailsForDuration(int months) {
//		LocalDate currentDate = LocalDate.now();
//        LocalDate startDate = currentDate.minusMonths(months);
//        return awsRepository.findByusageDateBetween(startDate, currentDate);
//	}

	@Override
	public List<Aws> getBillingByStartDate(String startDate) {
		List<Aws> data = awsRepository.findByStartDate(startDate);
		return data;
	}
	
	@Override
	public List<Aws> getBillingByService(String service) {
		List<Aws> data = awsRepository.findByService(service);
		return data;
	}
	
	@Override
	public List<Aws> findDataByServiceBetweenDates(String service, String startDate, String endDate) {
//		Date convertedStartDate = DateUtil.convertStringToDate(startDate);
//        Date convertedEndDate = DateUtil.convertStringToDate(endDate);
        return awsRepository.findByServiceAndStartDateAndEndDateBetween(service, startDate, endDate);
    }
	
	@Override
	public Long getCountOfData() {
		
		return awsRepository.count();
	}
	
	@Override
	public List<Aws> findDataBetweenStartAndEndDate(String startDate, String endDate) {
        return awsRepository.findByStartDateAndEndDateBetween(startDate, endDate);
    }
	
}