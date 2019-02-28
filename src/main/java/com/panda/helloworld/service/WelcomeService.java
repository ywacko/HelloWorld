package com.panda.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String welcome(String name) {
        return "Hello, " + name + "! <br>Welcome to my World!";
    }

    public String helloWorld() {
        return "Hello World!";
    }
}
