package com.anil.boltcab.service;

import com.anil.boltcab.model.Driver;

public interface DriverService {
	boolean isAvailable(Driver driver);
	double totalEarning(Driver driver);
}
