package com.library.libraryfinal.control;


import com.library.libraryfinal.model.User_login;
import com.library.libraryfinal.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(method = RequestMethod.POST,value = "/saveuserlogin")
    public void saveUserLogin(@RequestBody User_login user_login){
        userLoginService.saveUserLogin(user_login);
    }

    @RequestMapping("/getLogUsers")
    public List<User_login> getLogUsers(){return userLoginService.getLogUsers();}

    @RequestMapping(method = RequestMethod.PUT,value = "/updateLogUser/{id}")
    public void updateLogUser(@PathVariable Integer id, @RequestBody User_login user_login){
        userLoginService.updateLogUser(id,user_login);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteLogUSer/{id}")
    public void deleteLogUser(@PathVariable Integer id){userLoginService.deleteLogUser(id);}
}
