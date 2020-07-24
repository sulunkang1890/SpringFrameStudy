package com.slk.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestServiceV2 implements InitializingBean {
	@Autowired
	IService iService;

	public IService getiService() {
		return iService;
	}

	@PostConstruct
	void init(){
		System.out.println("init method");
	}

	public void setiService(IService iService) {
		this.iService = iService;
	}

	/**
	 * bean的生命 周期回调  三种方法 1.注解 2.继承InitializingBean 3.XML init-method 具体执行顺序 需要看官方文档
	 * 需要看 生命周期的后置处理器
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		this.init();
	}
}
