package com.es.eoi.shop.utils;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.entities.ArticleCategory;
import com.es.eoi.shop.entities.Electronics;
import com.es.eoi.shop.entities.Food;
import com.es.eoi.shop.entities.Textile;
import com.google.gson.JsonObject;

public class ArticleFactory {

	public static Article getArticle(int category) 
	{
		Article article = null;

		switch (category) {
		case 3:
			article = new Textile();
			article.setCategory(new ArticleCategory(3,"textil"));
			break;
		case 1:
			article = new Electronics();
			article.setCategory(new ArticleCategory(1,"Electronics"));
			break;
		case 2:
			article = new Food();
			article.setCategory(new ArticleCategory(2,"Food"));
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
			article.setCategory(new ArticleCategory(3,"textil"));
			article.setCode(json.getAsJsonObject().get("code").getAsString());
			article.setName(json.getAsJsonObject().get("name").getAsString());
			article.setPrice(json.getAsJsonObject().get("price").getAsDouble());
			break;
		case "electronica":
			article = new Electronics();
			article.setCategory(new ArticleCategory(1,"Electronics"));
			article.setCode(json.getAsJsonObject().get("code").getAsString());
			article.setName(json.getAsJsonObject().get("name").getAsString());
			article.setPrice(json.getAsJsonObject().get("price").getAsDouble());
		
			break;
		case "alimentacion":
			article = new Food();
			article.setCategory(new ArticleCategory(2,"Food"));
			article.setCode(json.getAsJsonObject().get("code").getAsString());
			article.setName(json.getAsJsonObject().get("name").getAsString());
			article.setPrice(json.getAsJsonObject().get("price").getAsDouble());
			break;
		default:
			break;
		}
		return article;

	}

}
