package com.bl.demo.demo.service;

import com.bl.demo.demo.dto.UserDto;
import com.bl.demo.demo.exception.UserExceptions;
import com.bl.demo.demo.model.User;
import com.bl.demo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

   /* @Override
    public User addUser(UserDto userDto) {
        Optional<User> user1 = userRepository.findUserByFirstName(userDto.getFirstName());
        if (user1.isPresent()) {
            throw new UserException("User already present");

        }
            User userDto = new User(userDto);
            return userRepository.save(userDto);
    }
*/
   @Override
   public User addUser(UserDto userDto) {
       Optional<User> user1 = userRepository.findUserByFirstNameAndLastName(userDto.getFirstName(),userDto.getLastName());
       if (user1.isPresent()) {

           throw new UserExceptions("Id or name already present", UserExceptions.ExceptionType.USER_PRESENT);
       }
       User user2 = new User(userDto);
       return userRepository.save(user2);
   }
    @Override
    public List<User> displayUser() {
       return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer userId) {
       userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(Integer userId, UserDto userDto) {
        User user = userRepository.findById(userId).get();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }

    @Override
    public User displayUserById(Integer id) {
        return  userRepository.findById(id).get();
    }
}