package io.pivotal.jdkdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        
        //return "hello from Spring Boot!";
        return System.getProperty("java.version");
    }
}
