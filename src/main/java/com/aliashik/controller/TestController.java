package com.aliashik.controller;


import com.aliashik.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableWebMvc
public class TestController {
    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public Map<String, String> ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("pong", "Hello, World!");

        return pong;
    }
    @RequestMapping(path = "/test", method = RequestMethod.POST)
    public User pong(@RequestBody User user) {
        user.setName(user.getName()+":: Modified");
        return user;
    }
}
