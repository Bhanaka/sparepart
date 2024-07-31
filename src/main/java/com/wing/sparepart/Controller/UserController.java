package com.wing.sparepart.Controller;

import com.wing.sparepart.Entity.UserRegistration;
import com.wing.sparepart.Service.UserRegistrationService;
import com.wing.sparepart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wing.sparepart.Entity.UserRole;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService ;
    @Autowired
    UserRegistrationService userRegistrationService;
    @GetMapping("/test")
    public String testApi(){
        return "test api";
    }
    @GetMapping("/role")
    public List<UserRole> getAllUsersRole(){
        return userService.getAllUsers();
    }
    @PostMapping("/insert")
    public UserRegistration saveUsers(@RequestBody UserRegistration userRegistration){
        return userRegistrationService.saveUser(userRegistration) ;
    }
}
