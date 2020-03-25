package com.ramostear.qualifier.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Cow
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 0:33
 * @Version since UnaBoot-1.0
 **/

@Component("cow")
public class Cow implements Animal {
    @Override
    public void speak() {
        System.out.println("Moo~Moo~");
    }
}
