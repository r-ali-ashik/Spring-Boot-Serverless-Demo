package com.aliashik.controller;

import com.aliashik.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Collections;
import java.util.List;

@RestController
@EnableWebMvc
public class UserController {

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return Collections.singletonList(new User(1, "Alli"));
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        user.setName(user.getName() + " ::: modified");
        return user;
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable String id) {
        return new User(1, "Ali Baba");
    }
    @RequestMapping(path = "/users/{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        user.setName(user.getName() + " ::: modified");
        return user;
    }
}
