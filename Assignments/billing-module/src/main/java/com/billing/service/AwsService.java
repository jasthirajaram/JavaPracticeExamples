package com.billing.service;

import java.util.List;

import com.billing.entity.Aws;

public interface AwsService {

//	public List<Aws> getBillingDetailsForDuration(int months);
	
	public Long getCountOfData();
	
	public List<Aws> getBillingByStartDate(String startDate);
	
	public List<Aws> getBillingByService(String service);
	
    public List<Aws> findDataByServiceBetweenDates(String service, String startDate, String endDate);

    public List<Aws> findDataBetweenStartAndEndDate(String startDate, String endDate);
}

