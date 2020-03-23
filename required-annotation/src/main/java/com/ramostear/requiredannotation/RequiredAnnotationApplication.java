package com.ramostear.requiredannotation;

import com.ramostear.requiredannotation.beans.Computer;
import com.ramostear.requiredannotation.config.BeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class RequiredAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RequiredAnnotationApplication.class, args);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        Computer computer = context.getBean(Computer.class);
        computer.work();
        context.close();
    }

}
