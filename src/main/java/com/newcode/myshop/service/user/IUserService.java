package com.newcode.myshop.service.user;

import com.newcode.myshop.dto.UserDto;
import com.newcode.myshop.model.User;
import com.newcode.myshop.request.CreateUserRequest;
import com.newcode.myshop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
