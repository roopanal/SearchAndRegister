package com.example.SearchAndRegister.controller.dto;

public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String accept_reject_Flag;
    private String userSex;
    private String img;

    public UserDto(String firstName, String lastName, String email, String password, String accept_reject_Flag, String userSex, String img) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accept_reject_Flag = accept_reject_Flag;
        this.userSex = userSex;
        this.img = img;
    }

    public UserDto() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccept_reject_Flag() {
        return accept_reject_Flag;
    }

    public void setAccept_reject_Flag(String accept_reject_Flag) {
        this.accept_reject_Flag = accept_reject_Flag;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
