package com.example.SearchAndRegister.service;


import com.example.SearchAndRegister.model.User;
import com.example.SearchAndRegister.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }



    @Override
    public void addUser(User user) {
        // TODO Auto-generated method stub
        userRepository.save(user);
    }

}
