package cn.test.video.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {



    @GetMapping("/product")
    public  Object  getSth(){

        return "我就是看看";
    }



}
