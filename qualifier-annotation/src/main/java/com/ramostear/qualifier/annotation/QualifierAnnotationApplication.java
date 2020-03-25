package com.ramostear.qualifier.annotation;

import com.ramostear.qualifier.annotation.beans.*;
import com.ramostear.qualifier.annotation.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QualifierAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(QualifierAnnotationApplication.class, args);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DogZoo dogZoo = context.getBean(DogZoo.class);
        dogZoo.animalSpeaking();

        CatZoo catZoo = context.getBean(CatZoo.class);
        catZoo.animalSpeaking();

        CowZoo cowZoo = context.getBean(CowZoo.class);
        cowZoo.animalSpeaking();

        MonkeyZoo monkeyZoo = context.getBean(MonkeyZoo.class);
        monkeyZoo.monkeyShowTime();

        PigZoo pigZoo = context.getBean(PigZoo.class);
        pigZoo.pigShowTime();

        OtherZoo otherZoo = context.getBean(OtherZoo.class);
        otherZoo.showTime();

        context.close();
    }

}
