package cn.guangzhou.shiyu;

import cn.guangzhou.shiyu.configuration.AppConfig;
import cn.guangzhou.shiyu.model.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2018/8/1.
 */
public class AppWithJavaConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        MyBean myBean=ctx.getBean(MyBean.class);
        //myBean.setName("sshiyu");

        System.out.println(myBean.getName());

    }
}
