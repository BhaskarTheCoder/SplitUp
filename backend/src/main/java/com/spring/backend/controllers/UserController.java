package com.spring.backend.controllers;

import com.spring.backend.IServices.IUserService;
import com.spring.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/register")
    public User saveUserInfo(@RequestBody User user) throws Exception {
      return iUserService.saveUserInfo(user);
    }

    @PostMapping("/login")
    public boolean userLogin(@RequestBody User user) {
        return iUserService.loginDetails(user.getEmail(),user.getPassword());
    }

    @GetMapping("/welcome")
    public void welcome(){
        System.out.println("Welcome");
    }

}
