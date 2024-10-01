package com.RIVINE.service;

import java.util.List;

import com.RIVINE.exception.UserException;
import com.RIVINE.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
