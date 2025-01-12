package com.es.eoi.shop.entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.es.eoi.shop.utils.ArticleFactory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Warehouse {

	private List<Article> articles;


	public Warehouse() throws IOException {
		
		this.articles=new ArrayList<Article>();
		
		FileReader reader=new FileReader(new File("src/main/resources/Wharehouse.json"));
		BufferedReader buffer= new BufferedReader(reader);
		
		 String line;
         while ((line = buffer.readLine()) != null) {            
        	 Gson gson= new Gson();        	 
        	 JsonObject json = gson.fromJson(line, JsonObject.class);  
        	 articles.add(ArticleFactory.getArticleFromJson(json));        	
         }	         
         buffer.close();		
	}	
	
	public void insertArticle(Article article) throws IOException {
		
		Gson gson=new Gson();		
		FileWriter writter= new FileWriter(new File("src/main/resources/Wharehouse.json"),true);
		writter.write(gson.toJson(article));		
		writter.close();
		
	}
	
	
}
