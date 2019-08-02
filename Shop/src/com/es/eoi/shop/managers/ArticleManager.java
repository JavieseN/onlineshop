package com.es.eoi.shop.managers;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Warehouse;
import com.es.eoi.shop.interfaces.Manageable;

public class ArticleManager implements Manageable {

	private Warehouse warehouse;	

	public ArticleManager(Warehouse warehouse) {
		super();
		this.warehouse = warehouse;
	}

	@Override
	public void save(Article newArticle) {

		for (Article article : warehouse.getArticles()) {

			if (article.equals(null)) {
				article = newArticle;
			}
		}
	}

	@Override
	public void delete(Article deleteArticle) {

		for (Article article : warehouse.getArticles()) {

			if (article.equals(deleteArticle)) {
				article = null;
			}
		}
	}

}
