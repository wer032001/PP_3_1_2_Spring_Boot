package com.example.pp_3_1_2_spring_boot.service;

import com.example.pp_3_1_2_spring_boot.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUserById(Long id);

    User updateUser(User user, Long id);

    List<User> listUsers();

    void removeUser(Long id);
}
