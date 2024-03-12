package by.teachmeskills.store.mapper;

import by.teachmeskills.store.api.user.UserRequest;
import by.teachmeskills.store.api.user.UserResponse;
import by.teachmeskills.store.entity.User;

public class UserMapper {

    public User toEntity(UserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setSurname(userRequest.getSurname());
        user.setLogin(userRequest.getLogin());
        user.setPassword(userRequest.getPassword());
        return user;
    }

    public UserResponse toResponse(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setSurname(user.getSurname());
        userResponse.setLogin(user.getLogin());
        userResponse.setFullName(user.getName() + " " + user.getSurname());
        userResponse.setRole(user.getRole());
        return userResponse;
    }
}
