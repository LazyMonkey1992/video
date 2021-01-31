package cn.test.video.config;

import cn.test.video.entity.SpringClientFactory;
import cn.test.video.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    @Qualifier
    public Student student(){

        Student student=new Student();
        student.setName("赵伟");
        student.setAge(18);
        return student;

    }


    @Bean
    public Student student1(){

        Student student=new Student();
        student.setName("余毅");
        student.setAge(21);
        return student;

    }



    @Bean
    public SpringClientFactory springClientFactory(){

        SpringClientFactory springClientFactory=new SpringClientFactory();
        springClientFactory.setName("zhaowei");
        return springClientFactory;

    }



}
