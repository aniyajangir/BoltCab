 package com.anil.boltcab.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.boltcab.model.Driver;
import com.anil.boltcab.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	User findByEmail(String email); 
}
