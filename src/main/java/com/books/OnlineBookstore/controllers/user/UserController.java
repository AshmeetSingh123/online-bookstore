package com.books.OnlineBookstore.controllers.user;

import com.books.OnlineBookstore.models.user.UserBean;
import com.books.OnlineBookstore.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public String createUser(@RequestHeader("custom-auth") String customAuthHeader, @RequestBody UserBean user){

        return userService.save(user);
    }

    @GetMapping("/fetchByName/{name}")
    public List<UserBean> fetchUserDetailsByUserid(@RequestHeader("custom-auth") String customAuthHeader, @PathVariable("name") String name){

        return userService.findByName(name);
    }

}
