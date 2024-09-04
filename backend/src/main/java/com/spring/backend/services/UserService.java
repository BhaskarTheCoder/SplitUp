package com.spring.backend.services;

import com.spring.backend.IRepositories.IUserRepo;
import com.spring.backend.IServices.IUserService;
import com.spring.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepo iUserRepo;

    @Override
    public User saveUserInfo(User user) throws Exception {
        User checkUser = iUserRepo.findByEmail(user.getEmail());
        if(checkUser == null) {
            return iUserRepo.save(user);
        }
        throw new Exception("User with " + checkUser.getEmail() + " already exists");
    }

    @Override
    public User loginDetails(String email, String password) throws Exception {
        User userObj = null;
        if (email != null && password != null) {
            userObj = iUserRepo.findByEmailAndPassword(email, password);
        }
        if (userObj == null) {
            throw new Exception("Bad Credentials");
        }
        return userObj;
    }


}
