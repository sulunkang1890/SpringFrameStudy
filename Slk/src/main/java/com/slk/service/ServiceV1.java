package com.slk.service;

import com.slk.annotationslk.SlkScan;
import org.mybatis.spring.annotation.MapperScan;

@SlkScan
@MapperScan
public class ServiceV1 {
	ServiceV1(){
		System.out.println("ServiceV1");
	}
}
