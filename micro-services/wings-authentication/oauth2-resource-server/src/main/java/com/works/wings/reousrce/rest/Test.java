package com.works.wings.reousrce.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/messages/t")
    public String tes(){
        return "hello world!!!!";
    }

}
