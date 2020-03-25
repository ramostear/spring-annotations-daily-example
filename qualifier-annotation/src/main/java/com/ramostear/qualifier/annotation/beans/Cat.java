package com.ramostear.qualifier.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 0:31
 * @Version since UnaBoot-1.0
 **/
@Component("cAt")
public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow ~ Meow ~");
    }
}
