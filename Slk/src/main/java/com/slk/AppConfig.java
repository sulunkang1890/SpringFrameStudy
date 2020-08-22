package com.slk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //** @Bean  是单例
@ComponentScan("com.slk")
@MapperScan("com.slk.mapper")
public class AppConfig {
}
