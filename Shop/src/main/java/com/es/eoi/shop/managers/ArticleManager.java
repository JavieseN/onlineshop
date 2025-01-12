package com.es.eoi.shop.managers;

import java.io.IOException;
import java.util.List;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.interfaces.Manageable;

public class ArticleManager implements Manageable<Article> {

	private Warehouse warehouse;

	public ArticleManager(Warehouse warehouse) {
		super();
		this.warehouse = warehouse;
	}

	@Override
	public Article read(String code) {

		for (Article article : warehouse.getArticles()) {
			if (article != null && article.getCode().equals(code)) {
				return article;
			}
		}
		return null;
	}

	@Override
	public void save(Article entity) {
		this.warehouse.getArticles().add(entity);
		try {
			this.warehouse.insertArticle(entity);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Article entity) {
		for (int i = 0; i < warehouse.getArticles().size(); i++) {
			Article article = warehouse.getArticles().get(i);
			if (article.getCode().equals(entity.getCode())) {
				warehouse.getArticles().remove(i);
			}
		}
	}

	@Override
	public void update(Article entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Article> listAll() {
		return this.warehouse.getArticles();
	}

}
