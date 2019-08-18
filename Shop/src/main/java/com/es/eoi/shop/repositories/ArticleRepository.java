package com.es.eoi.shop.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.interfaces.Manageable;
import com.es.eoi.shop.utils.ArticleFactory;
import com.es.eoi.shop.utils.CategoryEnum;

public class ArticleRepository implements Manageable<Article> {

	public String database;
	public String user;
	public String password;

	public ArticleRepository(String database, String user, String password) throws SQLException {
		super();
		this.database = database;
		this.user = user;
		this.password = password;
	}

	public ArticleRepository() {
		this.database = "jdbc:mysql://localhost:3306/shop?serverTimezone=UTC";
		this.user = "root";
		this.password = "root";
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.database,this.user,this.password);
	}

	@Override
	public Article read(String code) throws SQLException {

		Article article = null;
		Connection con = getConnection();

		String sql = "SELECT * FROM ARTICLE WHERE CODE=?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, code);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			
			int category=rs.getInt("idCategory");
			
			switch (category) {
			case 1:
				article = ArticleFactory.getArticle(CategoryEnum.valueOf("ELECTRONICS").getCategoryName());
				break;
			case 2:
				article = ArticleFactory.getArticle(CategoryEnum.valueOf("FOOD").getCategoryName());
				break;
			case 3:
				article = ArticleFactory.getArticle(CategoryEnum.valueOf("TEXTILE").getCategoryName());
				break;
			default:			
				article = ArticleFactory.getArticle(CategoryEnum.valueOf("ELECTRONICS").getCategoryName());
				break;
			}
		
			article.setId(rs.getInt("idArticle"));
			article.setName(rs.getString("name"));
			article.setCode(rs.getString("code"));
		}

		return article;
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
