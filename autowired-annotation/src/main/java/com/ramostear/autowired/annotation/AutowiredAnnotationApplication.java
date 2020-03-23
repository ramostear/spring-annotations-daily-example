package com.ramostear.autowired.annotation;

import com.ramostear.autowired.annotation.beans.Computer;
import com.ramostear.autowired.annotation.beans.MagicBook;
import com.ramostear.autowired.annotation.beans.XPhone;
import com.ramostear.autowired.annotation.beans.XWatch;
import com.ramostear.autowired.annotation.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowiredAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutowiredAnnotationApplication.class, args);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("@Autowired Annotation on field.");
        Computer computer = context.getBean(Computer.class);
        computer.working();

        System.out.println("@Autowired Annotation on setter method.");
        MagicBook magicBook = context.getBean(MagicBook.class);
        magicBook.working();

        System.out.println("@Autowired Annotation on constructor.");
        XPhone xPhone = context.getBean(XPhone.class);
        xPhone.working();

        System.out.println("Single constructor does not use @Autowired annotation.");
        XWatch xWatch = context.getBean(XWatch.class);
        xWatch.working();

        context.close();

    }

}
