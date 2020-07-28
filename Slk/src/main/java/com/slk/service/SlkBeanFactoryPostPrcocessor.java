package com.slk.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 扫描完成之后  parase解析之后  put beanDefinitionMap 之前
 */
//@Component
public class SlkBeanFactoryPostPrcocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition slkService = (GenericBeanDefinition) beanFactory.getBeanDefinition("userService");

		/**
		 * 修改原有应该被实例化的类
		 */
		slkService.setBeanClass(TestBeandefintion.class);

	}
}
