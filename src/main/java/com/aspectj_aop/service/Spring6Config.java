package com.aspectj_aop.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.aspectj_aop.service"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {

}
