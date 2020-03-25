package com.ramostear.qualifier.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:44
 **/
@Configuration
@ComponentScan(basePackages = {"com.ramostear.qualifier.annotation.beans"})
public class AppConfig {
}
