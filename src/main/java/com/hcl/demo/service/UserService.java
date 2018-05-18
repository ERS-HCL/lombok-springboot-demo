package com.hcl.demo.service;

import com.hcl.demo.dto.User;
import com.hcl.demo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User findById(Integer id) throws UserNotFoundException {

        if (id == null) {
            throw new UserNotFoundException("ID not provided!");
        }

        return User.builder()
                .name("Jack")
                .age(25)
                .build();

    }
}
