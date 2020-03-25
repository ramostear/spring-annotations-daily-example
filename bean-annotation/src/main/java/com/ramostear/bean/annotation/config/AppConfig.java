package com.ramostear.bean.annotation.config;

import com.ramostear.bean.annotation.beans.*;
import org.springframework.context.annotation.*;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author 树下魅狐
 * @Date 2020/3/23 0023 17:44
 **/
@Configuration
public class AppConfig {
    @Bean(name = "tangseng")
    @DependsOn(value ={"monkeyKing","bajie","sandMonk"} )
    public TangSeng tangSeng(){
        return new TangSeng();
    }
    @Bean(initMethod = "birth",destroyMethod = "destroy")
    public MonkeyKing monkeyKing(){
        return new MonkeyKing();
    }

    @Bean(name = "monkey")
    @Primary
    public Monkey monkey(){
        return new MonkeyKing();
    }

    @Bean(name = "monkey")
    public Monkey monkeyCopy(){
        return new MonkeyKingCopy();
    }

    @Bean(name = {"pig","bajie"})
    public MarshalCanopy marshalCanopy(){
        return new MarshalCanopy();
    }



    @Bean(name = "huaguoshan")
    public Mountain mountain(){
        return new Mountain(monkeyKing());
    }


    @Bean(name = "sandMonk")
    @Lazy
    public SandMonk sandMonk(){
        return new SandMonk();
    }


}
