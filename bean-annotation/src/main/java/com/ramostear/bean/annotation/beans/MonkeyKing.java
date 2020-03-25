package com.ramostear.bean.annotation.beans;

/**
 * @ClassName MonkeyKing
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/25 0025 14:42
 * @Version since UnaBoot-1.0
 **/
public class MonkeyKing implements Monkey{

    private String name;
    private String alias;


    public void birth(){
        System.out.println("美猴王出世...");
    }

    public void destroy(){
        System.out.println("孙猴子被如来压在了五行山下...");
    }

    public MonkeyKing(){
        this.name = "孙悟空";
        this.alias = "齐天大圣";
        System.out.println("name:"+this.name+",alias:"+this.alias);
    }

    public void monkeyShowTime(){
        System.out.println(this.name+": 我是"+this.alias+" "+this.name);
    }
}
