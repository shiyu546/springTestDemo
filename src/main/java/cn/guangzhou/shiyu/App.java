package cn.guangzhou.shiyu;

import cn.guangzhou.shiyu.model.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/application-context.xml");

        MyBean myBean= (MyBean) context.getBean("mybean");

        myBean.setName("shiyu");

        System.out.println(myBean.getName());


    }
}
