package com.ramostear.component.annotation;

import com.ramostear.component.annotation.beans.Demo;
import com.ramostear.component.annotation.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ComponentAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentAnnotationApplication.class, args);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        /*Demo demo = context.getBean(Demo.class);*/
        Demo demo = (Demo)context.getBean("demoBean");
        System.out.println("demo text is : "+ demo.getText());
    }

}
