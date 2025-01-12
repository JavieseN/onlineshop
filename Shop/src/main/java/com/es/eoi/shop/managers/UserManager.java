package com.es.eoi.shop.managers;

import java.util.List;

import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.interfaces.Manageable;

public class UserManager implements Manageable<User> {

	private List<User> users;

	public UserManager(List<User> users) {
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
		this.users.add(entity);
	}

	@Override
	public void delete(User entity) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getUsername().equals(entity.getUsername())) {
				users.remove(i);
			}
		}
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> listAll() {
		return this.users;
	}

}
