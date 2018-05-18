package com.hcl.demo.service;

import com.hcl.demo.dto.User;
import com.hcl.demo.exception.UserNotFoundException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    UserService userService;

    // Less boiler plate checked exceptions
    // that you are forced to catch
    // use SneakyThrows instead
    @SneakyThrows(UserNotFoundException.class)
    public User getProfile() {
        return userService.findById(1);
    }
}
