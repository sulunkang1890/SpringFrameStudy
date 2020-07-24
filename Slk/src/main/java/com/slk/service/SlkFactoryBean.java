package com.slk.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 如何把自己的对象放在IOC容器中 FactoryBean @Bean
 */
@Component
public class SlkFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new OredeService();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

}
