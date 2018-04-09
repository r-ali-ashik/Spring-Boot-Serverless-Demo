package com.aliashik.controller;

import com.aliashik.model.User;
import com.aliashik.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        user.setName(user.getName() + " ::: modified");
        return userService.addUser(user);
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }
    @RequestMapping(path = "/users/{id}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}
