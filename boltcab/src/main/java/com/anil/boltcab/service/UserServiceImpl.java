package com.anil.boltcab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anil.boltcab.model.Driver;
import com.anil.boltcab.model.User;
import com.anil.boltcab.repo.DriverRepo;
import com.anil.boltcab.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	UserRepo userRepo;
	DriverRepo driverRepo;
	Driver driver;
	@Override
	public User updateUser(User user, int id) {
		User userDb = userRepo.findById(id).get();
           userDb.setContact(user.getContact());
           return userDb;
	}
	@Override
	public List<Driver> findCab(User user, int x, int y) {
		List<Driver> availableDrivers = new ArrayList<>();
		int xDriver = driver.getxCoordinate();
		int yDriver = driver.getyCoordinate();
		Iterable<Driver> drivers = driverRepo.findAll();
		for(Driver d : drivers)
		{
			int distance = findDistance(x, y, xDriver, yDriver);
			if(distance < 5 && driver.isAvaialable())
			{
				availableDrivers.add(d);
			}
		}
		return availableDrivers;
	}
	@Override
	public int findDistance(int x1, int y1, int x2, int y2) {
		int a = (x1*x1)-(y1*y2);
		int b = (x2*x2)-(y2*y2);
		int sum = a+b;
		return (int) Math.sqrt(sum);
	}
	@Override
	public int bookCab(User user, Driver driver) {
		driver.setAvaialable(false);
		int xDriver = driver.getxCoordinate();
		int yDriver = driver.getyCoordinate();
		int xUser = user.getxCoordinate();
		int yUser = user.getyCoordinate();
		int distance = findDistance(xDriver, yDriver, xUser, yUser);
		int fare = 15*distance;
		int balance = driver.getBalance() + fare;
		driver.setBalance(balance);
		return 15*distance;
	}
	
	}


