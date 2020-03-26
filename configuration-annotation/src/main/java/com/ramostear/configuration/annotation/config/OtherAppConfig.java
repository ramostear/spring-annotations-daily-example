package com.ramostear.configuration.annotation.config;

import com.ramostear.configuration.annotation.beans.OtherBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ParentAppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/27 0027 6:40
 * @Version since UnaBoot-1.0
 **/
@Configuration
public class OtherAppConfig {

    @Bean
    public OtherBean otherBean(){
        return new OtherBean();
    }
}
