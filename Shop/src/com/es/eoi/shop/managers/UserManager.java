package com.es.eoi.shop.managers;

import com.es.eoi.shop.Main;
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

		for (User user : users) {
			if (user != null && user.getUsername().equals(code)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void save(User entity) {
		for (int i = 0; i < users.length; i++) {
			if (null == users[i]) {
				users[i] = entity;
				break;
			}
		}

	}

	@Override
	public void delete(User entity) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].equals(entity)) {
				users[i] = null;
				break;
			}
		}

	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public User[] listAll() {
		return Main.users;
	}

}
