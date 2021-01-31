package cn.test.video.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringClientFactory implements ApplicationContextAware {


    private ApplicationContext applicationContext;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {



        System.out.println("haha");
        this.applicationContext=applicationContext;
    }
}
