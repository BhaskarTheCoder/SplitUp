package com.spring.backend.IRepositories;

import com.spring.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
    public User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);
}
