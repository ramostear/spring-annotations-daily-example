package com.ramostear.configuration.annotation.config;

import com.ramostear.configuration.annotation.beans.UserBean;
import com.ramostear.configuration.annotation.task.DemoTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/27 0027 4:13
 * @Version since UnaBoot-1.0
 **/
@Profile("prod")
@Configuration
@PropertySource(value = "classpath:app.properties")
@EnableScheduling
@ImportResource(value = "classpath:app.xml")
@Import(OtherAppConfig.class)
public class AppConfig {

    @Value("${author.email}")
    private String email;
    @Value("${author.site}")
    private String site;

    @Autowired
    private Environment environment;

    @Bean
    public UserBean userBean(){
        System.out.println(environment.getProperty("java.home"));
        System.out.println("Author email:"+email);
        System.out.println("Author site:"+site);
        return new UserBean("树下魅狐");
    }

    @Bean
    public DemoTask demoTask(){
        return new DemoTask();
    }

}
