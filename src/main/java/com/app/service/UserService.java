package com.app.service;

import com.app.dto.UserDTO;
import com.app.entities.User;

public interface UserService {

	User registerUser(User user);
	User updateUser(User user, String email);
	User getUserByEmail(String email);
	void deleteUser(String email);
}
