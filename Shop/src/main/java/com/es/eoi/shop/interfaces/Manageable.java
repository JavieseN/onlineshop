package com.es.eoi.shop.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface Manageable<T> {

	public T read(String code) throws SQLException;

	public void save(T object) throws SQLException;

	public void delete(T object) throws SQLException;

	public void update(T object) throws SQLException;

	public List<T> listAll() throws SQLException;

}
