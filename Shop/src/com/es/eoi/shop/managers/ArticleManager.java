package com.es.eoi.shop.managers;

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
	public void save(Article newArticle) {

		for (int i = 0; i < warehouse.getArticles().length; i++) {
			if (null == warehouse.getArticles()[i]) {
				warehouse.getArticles()[i] = newArticle;
				warehouse.getArticles()[i].setCode(String.valueOf(i));
				break;
			}
		}

	}

	@Override
	public void delete(Article deleteArticle) {

		for (int i = 0; i < warehouse.getArticles().length; i++) {
			if (warehouse.getArticles()[i].getCode().equals(deleteArticle.getCode())) {
				warehouse.getArticles()[i] = null;
				break;
			}
		}
	}

	@Override
	public Article read(String code) {
		for (int i = 0; i < warehouse.getArticles().length; i++) {
			if (warehouse.getArticles()[i].getCode().equals(code)) {
				return warehouse.getArticles()[i];
			}
		}
		return null;
	}

	@Override
	public void update(Article article) {
		// TODO

	}

	@Override
	public Article[] listAll() {
		return warehouse.getArticles();
	}

}
