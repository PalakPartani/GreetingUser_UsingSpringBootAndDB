package com.bl.demo.demo.service;

import com.bl.demo.demo.dto.UserDto;
import com.bl.demo.demo.model.User;
import com.bl.demo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

  /*  @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(UserDto user) {
        return userRepository.save(user);

    }

    @Override
    public List<User> displayUser() {
       return userRepository.findAll();
    }

    @Override
    public String deleteUser(Integer userId) {
        return null;
    }

    @Override
    public String updateUser(Integer userId) {
        return null;
    }*/
}
