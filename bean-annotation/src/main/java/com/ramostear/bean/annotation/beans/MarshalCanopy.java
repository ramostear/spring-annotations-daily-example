package com.ramostear.bean.annotation.beans;

/**
 * @ClassName MarshalCanopy
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/25 0025 15:02
 * @Version since UnaBoot-1.0
 **/
public class MarshalCanopy {

    private String name;
    private String alias;

    public MarshalCanopy(){
        this.name = "猪八戒";
        this.alias = "天蓬元帅";
        System.out.println("name:"+this.name+", alias:"+alias);
    }

    public void pigShowTime(){
        System.out.println(this.name+": 大师兄，师父被妖怪抓走了!");
    }
}
