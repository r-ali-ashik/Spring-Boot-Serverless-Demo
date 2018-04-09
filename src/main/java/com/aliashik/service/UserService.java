package com.aliashik.service;

import com.aliashik.model.User;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return Collections.singletonList(new User(1, "Ali"));
    }
    public User addUser(User user) {
        user.setName(user.getName() + " ::: modified");
        return user;
    }

    public User getUser(String id) {
        return new User(1, "Ali Baba");
    }
    public User updateUser(Integer id, User user) {
        user.setName(user.getName() + " ::: modified");
        return user;
    }
}
