package com.es.eoi.test.repositories;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.es.eoi.shop.entities.Article;
import com.es.eoi.shop.repositories.ArticleRepository;

public class ArticleRepositoryTest {
	
	ArticleRepository repository;

	@Before
	public void setUp() throws Exception {
		
		repository= new ArticleRepository();
	}

	@Test
	public void testRead() throws SQLException {
		Article article = repository.read("00001");
		assertEquals("00001", article.getCode());
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testListAll() {
		fail("Not yet implemented");
	}

}
