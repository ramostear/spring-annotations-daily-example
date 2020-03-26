package com.ramostear.configuration.annotation;

import com.ramostear.configuration.annotation.beans.UserBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConfigurationAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationAnnotationApplication.class, args);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.scan("com.ramostear.configuration.annotation");
        context.refresh();

        UserBean user = context.getBean(UserBean.class);
        System.out.println(user.getUsername());

        UserBean unaBoot = (UserBean) context.getBean("unaBoot");
        System.out.println("app.xml config bean :"+ unaBoot.getUsername());
    }

}
