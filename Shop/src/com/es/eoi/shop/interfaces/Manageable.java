package com.es.eoi.shop.interfaces;



public interface Manageable<T> {
	
	public T read(String code);
	public void save(T object);
	public void delete(T object);
	public void update(T object);

}
