package com.bl.demo.demo.service;

import com.bl.demo.demo.dto.UserDto;
import com.bl.demo.demo.model.User;

import java.util.List;

public interface IUserService {
    User addUser(UserDto user);

    User displayUserById(Integer id);

    List<User> displayUser();

    void deleteUser(Integer userId);

    User updateUser(Integer userId, UserDto userDto);


}
