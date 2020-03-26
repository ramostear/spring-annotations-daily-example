package com.ramostear.configuration.annotation.config;

import com.ramostear.configuration.annotation.beans.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName DevAppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/27 0027 4:54
 * @Version since UnaBoot-1.0
 **/
@Profile("dev")
@Configuration
public class DevAppConfig {

    @Bean
    public UserBean userBean(){
        return new UserBean("谭朝红");
    }
}
