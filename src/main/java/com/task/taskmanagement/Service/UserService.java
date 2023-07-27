package com.task.taskmanagement.Service;

import com.task.taskmanagement.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);
    User findByUsername(String userName);
    User findById(int userId);

    List <User> findAll();
}
