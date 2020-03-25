package com.ramostear.bean.annotation.beans;

/**
 * @ClassName Mountain
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/25 0025 15:28
 * @Version since UnaBoot-1.0
 **/
public class Mountain {

    private String name;
    private MonkeyKing king;

    public Mountain(MonkeyKing king){
        this.name = "花果山";
        this.king = king;
    }

    public void showTime(){
        king.monkeyShowTime();
        System.out.println("住在"+this.name+"水帘洞");
    }
}
