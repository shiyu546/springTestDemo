package cn.guangzhou.shiyu.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/7/31.
 */
@Getter
@Setter
@Component
public class MyBean {

    String name;
    int age;

}
