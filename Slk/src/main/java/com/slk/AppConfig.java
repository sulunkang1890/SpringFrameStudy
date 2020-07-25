package com.slk;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //** @Bean  是单例
@ComponentScan("com.slk")
public class AppConfig {
}
