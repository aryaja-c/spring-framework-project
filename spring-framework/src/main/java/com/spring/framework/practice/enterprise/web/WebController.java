package com.spring.framework.practice.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.framework.practice.enterprise.business.BusinessService;

@Component
public class WebController {
	

	BusinessService businessService;
	
	@Autowired // setter injection
	public void setBusinessService(BusinessService businessService) {
		System.out.println("setter injection");
		this.businessService = businessService;
	}



	public long returnBusinnessValue() {
		
		return businessService.calculateSum();
	}
	
}

