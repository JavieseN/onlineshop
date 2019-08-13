package com.es.eoi.shop.utils;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.Electronics;
import com.es.eoi.shop.entities.Food;
import com.es.eoi.shop.entities.Textile;
import com.google.gson.JsonObject;

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
	
	public static Article getArticleFromJson(JsonObject json) {

		Article article = null;	
		
		switch (json.getAsJsonObject().get("category").getAsString()) {
		case "textil":
			article = new Textile();
			article.setCategory("textil");
			article.setCode(json.getAsJsonObject().get("code").getAsString());
			article.setName(json.getAsJsonObject().get("name").getAsString());
			article.setPrice(json.getAsJsonObject().get("prize").getAsDouble());
			break;
		case "electronica":
			article = new Electronics();
			article.setCategory("electronica");
			article.setCode(json.getAsJsonObject().get("code").getAsString());
			article.setName(json.getAsJsonObject().get("name").getAsString());
			article.setPrice(json.getAsJsonObject().get("prize").getAsDouble());
		
			break;
		case "alimentacion":
			article = new Food();
			article.setCategory("alimentacion");
			article.setCode(json.getAsJsonObject().get("code").getAsString());
			article.setName(json.getAsJsonObject().get("name").getAsString());
			article.setPrice(json.getAsJsonObject().get("prize").getAsDouble());
			break;
		default:
			break;
		}
		return article;

	}

}
