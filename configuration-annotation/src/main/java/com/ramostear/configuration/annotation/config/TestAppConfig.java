package com.ramostear.configuration.annotation.config;

import com.ramostear.configuration.annotation.beans.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName TestAppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/27 0027 4:57
 * @Version since UnaBoot-1.0
 **/
@Profile("test")
@Configuration
public class TestAppConfig {

    @Bean
    public UserBean userBean(){
        return new UserBean("ramostear");
    }
}
