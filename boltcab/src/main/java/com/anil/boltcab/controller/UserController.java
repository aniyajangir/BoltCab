package com.anil.boltcab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.anil.boltcab.model.Driver;
import com.anil.boltcab.model.User;
import com.anil.boltcab.repo.DriverRepo;
import com.anil.boltcab.repo.UserRepo;
import com.anil.boltcab.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private UserService userService;
	@Autowired
	private DriverRepo driverRepo;
	
	@GetMapping("/adduser")
	public User addUser(User user)
	{
		return userRepo.save(user);
	}
	
	@GetMapping("/adddriver")
	public Driver addDriver(Driver driver)
	{
		return driverRepo.save(driver);
	}
	
	@PutMapping("/updateuser")
	public void updateUser(User user)
	{
		userService.updateUser(user, user.getUserId());
	}
	
	@GetMapping("/getusers")
	public List<User> findUsers()
	{
		return userRepo.findAll();
	}
//	@GetMapping("/findCab")
//	public  Driver findCab(User user)
//	{
//		return (Driver) userService.findCab(user, user.getxCoordinate(), user.getyCoordinate());
//	}

}
