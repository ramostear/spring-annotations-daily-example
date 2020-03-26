package com.ramostear.configuration.annotation.beans;

/**
 * @ClassName UserBean
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/27 0027 4:13
 * @Version since UnaBoot-1.0
 **/
public class UserBean {

    private String username;

    public UserBean(String username){
        this.username = username;
        System.out.println("Initializing UserBean and  username is :"+this.username);
    }

    public String getUsername(){
        return this.username;
    }
}
