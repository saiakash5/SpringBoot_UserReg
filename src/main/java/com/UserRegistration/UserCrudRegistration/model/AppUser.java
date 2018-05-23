package com.UserRegistration.UserCrudRegistration.model;

public class AppUser {


    private Long userId;
    private String userName;
    private String fullName;
    private String phone;
    private boolean enabled;
    private String email;
    private String encrytedPassword;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public AppUser() {

    }

    public AppUser(Long userId, String userName, String fullName, String phone, //
                   boolean enabled,//
                   String email, String encrytedPassword) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.fullName = fullName;
        this.phone = phone;
        this.enabled = enabled;
        this.email = email;
        this.encrytedPassword = encrytedPassword;
    }
}