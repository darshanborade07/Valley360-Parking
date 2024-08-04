package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.entities.User;
import com.app.exception.UserAlreadyExistsException;
import com.app.exception.UserNotFoundException;
import com.app.repository.RoleRepository;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public User registerUser(User user) {
		if(userAlreadyExists(user.getEmail())) {
			throw new UserAlreadyExistsException(user.getEmail()+" already exists !");
		}
		
		return userRepository.save(user);
	}

	private boolean userAlreadyExists(String email) {
		
		return userRepository.findByEmail(email).isPresent();
	}

	@Override
	public User updateUser(User user, String email) {
		
		return userRepository.findByEmail(email).map(u -> {
			u.setFirstName(user.getFirstName());
			u.setLastName(user.getLastName());
			u.setContact(user.getContact());
			u.setAddress(user.getAddress());
			return userRepository.save(u);
		}).orElseThrow(() -> new UserNotFoundException("User could not be found !"));
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("No user found with the email :"+email));
	}

	@Override
	public void deleteUser(String email) {
		
	}
	
	
	
	
}
