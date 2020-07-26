package com.slk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component
public abstract class  TestService {
	//@Autowired //先通过type去注入 如果找不到在通过名字查找  通过filed.set注入  不需要提供set方法
//	@Autowired
//	IService slkServiceV2;
	@Lookup
	public abstract IService getService();

	public void xx(){
		this.xx();
	}


}
