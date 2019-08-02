package com.es.eoi.shop.managers;

import com.es.eoi.shop.Main;
import com.es.eoi.shop.entities.Order;
import com.es.eoi.shop.interfaces.Manageable;

public class OrderManager implements Manageable<Order> {

	private Order[] orders;

	public OrderManager(Order[] orders) {
		super();
		this.orders = orders;
	}

	@Override
	public Order read(String code) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].getId().equals(code)) {
				return orders[i];
			}
		}
		return null;
	}

	@Override
	public void save(Order object) {
		for (int i = 0; i < orders.length; i++) {
			if (null == orders[i]) {
				orders[i] = object;
				break;
			}
		}

	}

	@Override
	public void delete(Order object) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].equals(object)) {
				orders[i] = null;
			}
		}
	}

	@Override
	public void update(Order object) {
		// TODO

	}

	@Override
	public Order[] listAll() {
		return Main.orders;
	}

}
