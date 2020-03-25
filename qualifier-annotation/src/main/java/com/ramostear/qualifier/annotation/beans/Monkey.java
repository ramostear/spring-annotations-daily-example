package com.ramostear.qualifier.annotation.beans;

import com.ramostear.qualifier.annotation.custom.AnimalType;
import org.springframework.stereotype.Component;

/**
 * @ClassName Monkey
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 1:43
 * @Version since UnaBoot-1.0
 **/
@Component
@AnimalType(value = "monkey")
public class Monkey implements Animal{
    @Override
    public void speak() {
        System.out.println("dai~ dai~");
    }
}
