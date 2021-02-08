package com.yufuchang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yufuchang on 2020/7/25.
 */
@RestController
public class HelloController {

    @Value("${my.name}")
    String name;
    @Value("${my.age}")
    int age;
    /**
     * 所有/hello的映射
     * @return
     */
    @GetMapping("/hello")
    public String sayHello(){
        return "welcome to springBoot lessons,My name is "+name+"My age is "+age;
    }
}
