package com.es.eoi.shop.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.es.eoi.shop.entities.Order;
import com.es.eoi.shop.interfaces.Manageable;

public class OrderRepository implements Manageable<Order> {

	public String database;
	public String user;
	public String password;

	public OrderRepository(String database, String user, String password) {
		super();
		this.database = database;
		this.user = user;
		this.password = password;
	}

	public OrderRepository() {
		this.database = "jdbc:mysql://localhost:3306/shop";
		this.user = "root";
		this.password = "root";
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.database,this.user,this.password);
	}

	@Override
	public Order read(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Order object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Order object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Order object) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Order> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
