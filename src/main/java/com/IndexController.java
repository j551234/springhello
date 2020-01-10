package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String sayHello() {
        return "I am  the king of the world!";
    }
    public String sayyo() {
        return "Hello,World!";
    }
    String yo="10";
}
