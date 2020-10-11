package com.example.SearchAndRegister.controller;

import com.example.SearchAndRegister.AWS.AWSS3Service;
import com.example.SearchAndRegister.model.User;
import com.example.SearchAndRegister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/registration")
public class UserController {

    private UserService userService;
    @Autowired
    private AWSS3Service awss3Service;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping
    public String addUser(User user,@RequestParam("file") MultipartFile file) {
        String fileName = awss3Service.uploadFile(file);
        user.setImg(fileName);
        user.setAcceptRejectFlag("Y");
        user.setUserSex("F");
        userService.addUser(user);
        return "redirect:/registration?success";
    }


}
