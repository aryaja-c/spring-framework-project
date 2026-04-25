package com.spring.framework.practice.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.framework.practice.enterprise.data.DataService;

@Component
public class BusinessService {
	
	@Autowired //Field injection
	DataService dataService;
	
	public long calculateSum() {
		
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}

}

