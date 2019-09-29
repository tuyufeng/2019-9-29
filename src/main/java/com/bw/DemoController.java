package com.bw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 */
@RestController
public class DemoController {
    /**
     *自定义配置文件
     * 使用application.yml中的自定义属性
     * @return
     */
    @Value("${heihei.name}")
    String  helloName;

    @Autowired
    private  Demo  demo;


    @RequestMapping("hi")
    public Object hello(){

        return "hello  "+helloName;
    }




}
