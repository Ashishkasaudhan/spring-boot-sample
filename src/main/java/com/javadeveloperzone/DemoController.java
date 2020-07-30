package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "ashish")
    public String hello(){
        return "Hello Ashish this is first sample app";
    }
}
