package com.es.eoi.shop.managers;

import java.sql.SQLException;
import java.util.List;

import com.es.eoi.shop.entities.Order;
import com.es.eoi.shop.interfaces.Manageable;
import com.es.eoi.shop.repositories.OrderRepository;

public class OrderManager implements Manageable<Order> {

	private OrderRepository repository=new OrderRepository();;
	
	@Override
	public Order read(String code) {
		return this.repository.read(code);
	}

	@Override
	public void save(Order object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Order object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Order object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> listAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}