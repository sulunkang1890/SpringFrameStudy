package com.slk.scanslk;

import com.slk.annotationslk.SlkScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

public class SlkScanner extends ClassPathBeanDefinitionScanner {
	public SlkScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		super.addIncludeFilter(new AnnotationTypeFilter(SlkScan.class));
	}
}
