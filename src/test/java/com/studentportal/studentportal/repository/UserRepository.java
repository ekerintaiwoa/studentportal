package com.studentportal.studentportal.repository;

import com.studentportal.studentportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
   // findby username
  Optional<User> findByUsername(String username);

}
