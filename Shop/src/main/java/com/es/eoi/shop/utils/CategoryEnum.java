package com.es.eoi.shop.utils;

import lombok.Getter;

@Getter
public enum CategoryEnum {

	ELECTRONICS(1, "electronica"), FOOD(2, "alimentación"), TEXTILE(2, "textil");

	private final int id;
	private final String categoryName;

	private CategoryEnum(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

}
