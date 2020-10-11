package com.example.SearchAndRegister.controller;

import com.example.SearchAndRegister.AWS.AWSS3Service;
import com.example.SearchAndRegister.controller.dto.UserDto;
import com.example.SearchAndRegister.model.User;
import com.example.SearchAndRegister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/registration")
public class userController {

    private UserService userService;
    @Autowired
    private AWSS3Service awss3Service;

    @Autowired
    public userController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String AddUser(User user,@RequestParam("file") MultipartFile file) {
        String fileName = awss3Service.uploadFile(file);
        user.setImg(fileName);
        user.setAccept_reject_Flag("Y");
        user.setUserSex("F");
        userService.AddUser(user);
        return "redirect:/registration?success";
    }

    @ModelAttribute("user")
    public UserDto userRegistrationDto() {
        return new UserDto();
    }

}
