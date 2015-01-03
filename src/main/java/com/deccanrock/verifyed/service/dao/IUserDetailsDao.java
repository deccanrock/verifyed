package com.deccanrock.verifyed.service.dao;

import com.deccanrock.verifyed.entity.UserLoginAttempts;

public interface IUserDetailsDao {

	void updateFailAttempts(String username);

	void resetFailAttempts(String username);
	
	UserLoginAttempts getUserAttempts(String username);

}