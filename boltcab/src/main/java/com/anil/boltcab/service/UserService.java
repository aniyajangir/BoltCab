package com.anil.boltcab.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anil.boltcab.model.Driver;
import com.anil.boltcab.model.User;


public interface UserService {
	User updateUser(User user, int id);
	List<Driver> findCab(User user, int x, int y);
	int findDistance(int x1, int y1, int x2, int y2);
	int bookCab(User user, Driver driver);
}
