package com.annotation2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 編寫一個類代替Spring框架的配置文件
 * */
@Configuration
@ComponentScan({"com.annotation2.dao","com.annotation2.service"})
public class Spring6Config {

}
