package com.ramostear.bean.annotation;

import com.ramostear.bean.annotation.beans.*;
import com.ramostear.bean.annotation.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanAnnotationApplication.class, args);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        /*MonkeyKing monkeyKing = context.getBean(MonkeyKing.class);
        monkeyKing.monkeyShowTime();

        MarshalCanopy bajie = (MarshalCanopy) context.getBean("bajie");
        MarshalCanopy pig = (MarshalCanopy) context.getBean("pig");

        bajie.pigShowTime();
        pig.pigShowTime();

        Mountain mountain = (Mountain) context.getBean("huaguoshan");
        mountain.showTime();*/
        Monkey monkey = context.getBean(Monkey.class);
        context.close();
    }

}
