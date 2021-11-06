package com.library.libraryfinal.service;


import com.library.libraryfinal.model.User_login;

import java.util.List;
import java.util.Optional;

public interface UserLoginService {

    List<User_login> getLogUsers();

    public Optional<User_login> updateLogUser(Integer id, User_login user_login);

    void deleteLogUser(Integer id);

    void saveUserLogin(User_login user_login);
}
