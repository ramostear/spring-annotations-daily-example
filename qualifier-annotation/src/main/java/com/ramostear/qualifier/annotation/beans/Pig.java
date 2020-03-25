package com.ramostear.qualifier.annotation.beans;

import com.ramostear.qualifier.annotation.custom.AnimalType;
import org.springframework.stereotype.Component;

/**
 * @ClassName Pig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 1:44
 * @Version since UnaBoot-1.0
 **/
@Component
@AnimalType(value = "pig")
public class Pig implements Animal{
    @Override
    public void speak() {
        System.out.println("heng ~ heng ~");
    }
}
