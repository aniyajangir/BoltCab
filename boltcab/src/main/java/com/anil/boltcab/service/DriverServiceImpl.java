package com.anil.boltcab.service;

import org.springframework.stereotype.Service;

import com.anil.boltcab.model.Driver;

@Service
public class DriverServiceImpl implements DriverService{

	@Override
	public boolean isAvailable(Driver driver) {
		return driver.isAvaialable();
	}

	@Override
	public double totalEarning(Driver driver) {
		return driver.getBalance();
	}

}
