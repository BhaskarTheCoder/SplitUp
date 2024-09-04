package com.spring.backend.IServices;

import com.spring.backend.models.User;

public interface IUserService {

    public User saveUserInfo(User user) throws Exception;

    public User loginDetails(String email, String password) throws Exception;
}