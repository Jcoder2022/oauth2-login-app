package com.oauth2.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oauth2.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
