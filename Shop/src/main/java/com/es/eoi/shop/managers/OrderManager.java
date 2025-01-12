package com.es.eoi.shop.managers;

import java.util.List;

import com.es.eoi.shop.entities.Order;
import com.es.eoi.shop.interfaces.Manageable;

public class OrderManager implements Manageable<Order> {

	private List<Order> orders;

	public OrderManager(List<Order> orders) {
		super();
		this.orders = orders;
	}

	@Override
	public Order read(String code) {

		for (Order order : orders) {
			if (order != null && order.getId().equals(code)) {
				return order;
			}
		}
		return null;
	}

	@Override
	public void save(Order entity) {
		this.orders.add(entity);
	}

	@Override
	public void delete(Order entity) {
		for (int i = 0; i < orders.size(); i++) {
			Order order = orders.get(i);
			if (order.getId().equals(entity.getId())) {
				orders.remove(i);
			}
		}
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Order> listAll() {
		return this.orders;
	}

}