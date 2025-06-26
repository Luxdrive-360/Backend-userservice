package com.luxdrive.UserService.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

    @GetMapping("/save")
    public void saveUser() {
        System.out.println("controller works");
    }
    
    @PostMapping("/sign-up")
    public void signUp() {
    	System.out.println("post");
//    	userServiceImpl.signUp(user);
    }
}

