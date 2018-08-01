package cn.guangzhou.shiyu.configuration;

import cn.guangzhou.shiyu.model.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/8/1.
 */
@Configuration
public class AppConfig {

    @Bean
    public MyBean myBean(){
        MyBean myBean=new MyBean();
        myBean.setName("haha llo");
        return myBean;
    }
}
