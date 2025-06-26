package com.luxdrive.UserService.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void signUp(User user) {
		System.out.println("userservice");
		
	}

}
