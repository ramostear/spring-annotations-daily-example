package com.ramostear.qualifier.annotation.beans;

import com.ramostear.qualifier.annotation.custom.AnimalType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName PigZoo
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 1:51
 * @Version since UnaBoot-1.0
 **/
@Component
public class PigZoo {

    @Autowired
    @AnimalType(value = "pig")
    private Animal animal;

    public void pigShowTime(){
        animal.speak();
    }
}
