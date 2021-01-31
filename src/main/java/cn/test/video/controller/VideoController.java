package cn.test.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class VideoController {

    @RequestMapping("/get")
    public void  get(HttpServletResponse response){

        File file=new File("C:\\Users\\zw\\Desktop\\codeTemp\\111.mp4");
        try {
            response.setContentType("video/mpeg4;charset=utf-8");
            ServletOutputStream outputStream = response.getOutputStream();
            FileInputStream fis=new FileInputStream(file);
            byte[] bytes=new byte[1024*10];
            int count=-1;
            while ((count=fis.read(bytes))>0){
                outputStream.write(bytes,0,count);

            }
            outputStream.flush();
           // response.flushBuffer();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
