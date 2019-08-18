package com.es.eoi.shop.entities;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

	private int id;
	private User user;
	private Date date;

}
