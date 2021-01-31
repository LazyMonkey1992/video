package cn.test.video.controller;

import cn.test.video.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    @Qualifier
    private List<Student> list;



    @RequestMapping("/students")
    public Object getStu(){


       return list;
    }


}
