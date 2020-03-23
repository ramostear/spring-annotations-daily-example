package com.ramostear.requiredannotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BeanConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:09
 **/
@Configuration
@ComponentScan(basePackages = {"com.ramostear.requiredannotation.beans"})
public class BeanConfig {
}
