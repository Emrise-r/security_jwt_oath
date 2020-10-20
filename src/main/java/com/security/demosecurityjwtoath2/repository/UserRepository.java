package com.security.demosecurityjwtoath2.repository;

import com.security.demosecurityjwtoath2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
