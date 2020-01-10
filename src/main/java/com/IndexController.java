package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
    public String sayyo() {
        return "Hello,World!";
    }
    String yo="10";
}
