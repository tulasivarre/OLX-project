package com.olx.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.olx.dto.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String authenticate(User user) {
		// TODO Auto-generated method stub
		return "A78DT";
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

	@Override
	public User createNewUser(User user) {
		user.setId((users.size() + 1));
		users.add(user);
		return user;
	}
	
	

	static List<User> users = new ArrayList<User>();

	static {

		users.add(new User(1, "Tulasi", "varre", "tulasi563", "tulasivarre@563", "tulasivarre@gmail.com", 784356882));
		users.add(new User(2, "Sai", "Kummaraguntla", "sai123", "sai@123", "sai@gmail.com", 989576462));

	}

	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean validationOfUser() {
		return true;
	}

}
