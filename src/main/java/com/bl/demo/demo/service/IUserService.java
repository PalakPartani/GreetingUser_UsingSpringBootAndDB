package com.bl.demo.demo.service;

import com.bl.demo.demo.dto.UserDto;
import com.bl.demo.demo.model.User;

import java.util.List;

public interface IUserService {
    User addUser(UserDto user);

    List<User> displayUser();

    String deleteUser(Integer userId);

    String updateUser(Integer userId);
}
