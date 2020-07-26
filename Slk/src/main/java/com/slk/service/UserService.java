package com.slk.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
//@DependsOn("oredeService")
public class UserService {
	public UserService(){
		System.out.println("new UserService");
	}
}
