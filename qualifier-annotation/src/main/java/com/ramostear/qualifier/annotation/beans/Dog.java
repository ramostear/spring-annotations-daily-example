package com.ramostear.qualifier.annotation.beans;

import org.springframework.stereotype.Component;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/24 0024 0:29
 * @Version since UnaBoot-1.0
 **/
@Component("dog")
public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Wang~Wang~");
    }
}
