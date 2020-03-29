package com.ramostear.component.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/28 0028 21:04
 * @Version since UnaBoot-1.0
 **/
@Configuration
@ComponentScan(basePackages = {"com.ramostear.component.annotation.beans"})
public class AppConfig {
}
