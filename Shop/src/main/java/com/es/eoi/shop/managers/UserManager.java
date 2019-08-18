package com.es.eoi.shop.managers;

import java.util.List;

import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.interfaces.Manageable;
import com.es.eoi.shop.repositories.UserRepository;

public class UserManager implements Manageable<User> {

	private UserRepository repository= new UserRepository();
	
	@Override
	public User read(String code) {
		return this.repository.read(code);
	}

	@Override
	public void save(User object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User object) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
