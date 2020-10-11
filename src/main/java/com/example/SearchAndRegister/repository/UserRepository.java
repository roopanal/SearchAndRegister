package com.example.SearchAndRegister.repository;

import com.example.SearchAndRegister.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{

}
