package com.ramostear.bean.annotation.beans;

/**
 * @ClassName SandMonk
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/25 0025 16:03
 * @Version since UnaBoot-1.0
 **/
public class SandMonk {

    private String name;

    private String alias;

    public SandMonk(){
        this.name = "沙悟净";
        this.alias = "沙和尚";
        System.out.println("name:"+this.name+",alias:"+this.alias);
    }

    public void showTime() {
        System.out.println(this.alias+": 大师兄，二师兄，师父被妖怪抓走了");
    }
}
