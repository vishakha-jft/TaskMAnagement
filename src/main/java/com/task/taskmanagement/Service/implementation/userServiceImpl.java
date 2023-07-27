package com.task.taskmanagement.Service.implementation;

import com.task.taskmanagement.entity.User;
import com.task.taskmanagement.repositories.UserRepo;
import com.task.taskmanagement.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements UserService {
    private UserRepo UserRepo;

    public userServiceImpl(UserRepo UserRepository) {
        super();
        this.UserRepo = UserRepository;
    }

    @Override
    public User save(User user) {
        return UserRepo.save(user);
    }

    @Override
    public User findByUsername(String userName) {
        return UserRepo.findByUsername(userName);
    }

    @Override
    public User findById(int userId) {
        return UserRepo.findById(userId);
    }

    @Override
    public List<User> findAll() {
        return UserRepo.findAll();
    }
}
