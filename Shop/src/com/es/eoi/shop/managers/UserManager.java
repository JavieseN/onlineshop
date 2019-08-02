package com.es.eoi.shop.managers;

import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.interfaces.Manageable;

public class UserManager implements Manageable<User> {

	private User[] users;

	public UserManager(User[] users) {
		super();
		this.users = users;
	}

	@Override
	public User read(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}




}
