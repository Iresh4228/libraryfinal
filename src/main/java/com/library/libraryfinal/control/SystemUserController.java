package com.library.libraryfinal.control;


import com.library.libraryfinal.model.System_user;
import com.library.libraryfinal.service.SystemuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SystemUserController {
    @Autowired
    private SystemuserService systemuserService;

    @RequestMapping(method = RequestMethod.POST,value = "/savesystemuser")

    public void saveSystemuser(@RequestBody System_user system_user){
        systemuserService.saveSystemuser(system_user);
    }

    @RequestMapping("/getAllUsers")
    public List<System_user> getAllUsers(){
        return systemuserService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/updateUser/{id}")
    public void updateSystemUser(@PathVariable Integer id, @RequestBody System_user system_user){
        systemuserService.updateSystemUser(id,system_user);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteUser/{id}")
    public void deleteSystemUser(@PathVariable Integer id){
        systemuserService.deleteSystemUser(id);
    }


}
