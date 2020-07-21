package com.slk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	IService iService;

	public IService getiService() {
		return iService;
	}

	public void setiService(IService iService) {
		this.iService = iService;
	}
}
