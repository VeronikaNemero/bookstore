package by.teachmeskills.store.service;

import by.teachmeskills.store.api.user.UserRequest;
import by.teachmeskills.store.api.user.UserResponse;
import by.teachmeskills.store.entity.User;
import by.teachmeskills.store.mapper.UserMapper;
import by.teachmeskills.store.repository.UserRepositoryImpl;
import by.teachmeskills.store.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserService {

    public UserResponse add (UserRequest userRequest){
        UserRepository userRepository =new UserRepositoryImpl();
        UserMapper userMapper=new UserMapper();
        User user=userMapper.toEntity(userRequest);
        userRepository.add(user);
        UserResponse userResponse= userMapper.toResponse(user);
        return userResponse;
    }

    public List<UserResponse> allUsers() {
        UserRepository userRepository = new UserRepositoryImpl();
        UserMapper userMapper = new UserMapper();
        List<UserResponse> userResponses = new ArrayList<>();
        Collection<User> users = userRepository.allUsers();
        for (User user : users) {
            UserResponse userResponse = userMapper.toResponse(user);
            userResponses.add(userResponse);
        }
        return userResponses;
    }
}
