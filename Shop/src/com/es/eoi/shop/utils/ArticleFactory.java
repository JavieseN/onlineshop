package com.es.eoi.shop.utils;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Electronics;
import com.es.eoi.shop.entities.Food;
import com.es.eoi.shop.entities.Textile;

public class ArticleFactory {

	public static Article getArticle(String category) {

		Article article = null;

		switch (category) {
		case "textil":
			article = new Textile();
			article.setCategory(category);
			break;
		case "electronica":
			article = new Electronics();
			article.setCategory(category);
			break;
		case "alimentacion":
			article = new Food();
			article.setCategory(category);
			break;
		default:
			break;
		}
		return article;

	}

}
