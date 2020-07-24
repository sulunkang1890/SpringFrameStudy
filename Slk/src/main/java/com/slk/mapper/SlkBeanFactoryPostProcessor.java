package com.slk.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * spring 后置处理器
 */
@Component
public class SlkBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition testService=(GenericBeanDefinition)beanFactory.getBeanDefinition("testService");
		//即使加入了@Autowired  testService.getAutowireMode() 也是0
		//testService.setAutowireMode(2); //改为注解的自动装配
		System.out.println(testService.getAutowireMode());
	}
}
