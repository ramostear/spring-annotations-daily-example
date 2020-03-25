package com.ramostear.bean.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName TangSeng
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/25 0025 15:41
 * @Version since UnaBoot-1.0
 **/
public class TangSeng {
    private String name;
    private String alias;
    public TangSeng(){
        this.name = "唐三藏";
        this.alias = "唐僧";
        System.out.println("name:"+this.name+",alias:"+this.alias);
    }
}
