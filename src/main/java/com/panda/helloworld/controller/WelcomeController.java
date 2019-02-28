package com.panda.helloworld.controller;

import com.panda.helloworld.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @RequestMapping("/hello/{name}")
    @ResponseBody
    @CrossOrigin
    public String myHello(@PathVariable String name) {
        return welcomeService.welcome(name);
    }

    @RequestMapping("/hello")
    @ResponseBody
    @CrossOrigin
    public String hello() {
        return welcomeService.helloWorld();
    }

}
