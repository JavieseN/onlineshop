package com.es.eoi.shop.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.es.eoi.shop.entities.User;
import com.es.eoi.shop.interfaces.Manageable;

public class UserRepository implements Manageable<User> {

	public String database;
	public String user;
	public String password;

	public UserRepository(String database, String user, String password) {
		super();
		this.database = database;
		this.user = user;
		this.password = password;
	}
	
	public UserRepository() {
		this.database = "jdbc:mysql://localhost:3306/shop";
		this.user = "root";
		this.password = "root";
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.database,this.user,this.password);
	}

	@Override
	public User read(String code) {
		// TODO Auto-generated method stub
		return null;
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
