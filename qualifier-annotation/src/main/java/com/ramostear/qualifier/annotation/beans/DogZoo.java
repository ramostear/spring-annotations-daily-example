package com.ramostear.qualifier.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ClassName DogZoo
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 1:15
 * @Version since UnaBoot-1.0
 **/
@Component
public class DogZoo {

    @Autowired
    @Qualifier(value = "dog")
    private Animal animal;

    public void animalSpeaking(){
        animal.speak();
    }
}
