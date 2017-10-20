package org.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<h3>I'm working with customer :: " + System.getenv("CUSTOMER") + "</h3>";
    }

}
