package com.anil.boltcab.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.boltcab.model.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer> {

}
