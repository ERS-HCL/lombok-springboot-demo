package com.hcl.demo.controller;

import com.hcl.demo.dto.Name;
import com.hcl.demo.dto.NameList;
import com.hcl.demo.dto.User;
import com.hcl.demo.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    ProfileService profileService;

    @RequestMapping("/names")
    public NameList nameList() {
        List<Name> arr = new ArrayList<>();
        arr.add(Name.builder()
                .name("dd")
                .locale("ss")
                .primary(true)
                .build());
        return NameList.builder()
                .id("ID-001")
                .names(arr)
                .build();
    }

    @RequestMapping("/user")
    public User user() {
        return User.builder()
                .name("Dave")
                .age(50)
                .build();
    }

    @RequestMapping("/userById")
    public User userbyId() {
        return profileService.getProfile();
    }
}
