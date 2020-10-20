package com.security.demosecurityjwtoath2.service.userService;

import com.security.demosecurityjwtoath2.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void save(User user);

    Iterable<User> findAll();
}
