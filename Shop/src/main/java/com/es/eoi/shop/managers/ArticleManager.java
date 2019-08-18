package com.es.eoi.shop.managers;

import java.sql.SQLException;
import java.util.List;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.interfaces.Manageable;
import com.es.eoi.shop.repositories.ArticleRepository;

public class ArticleManager implements Manageable<Article> {

	private ArticleRepository repository= new ArticleRepository();
	
	@Override
	public Article read(String code) throws SQLException {
		return this.repository.read(code);
	}

	@Override
	public void save(Article object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Article object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Article object) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Article> listAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
