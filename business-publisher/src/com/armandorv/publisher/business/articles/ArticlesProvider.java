package com.armandorv.publisher.business.articles;

import java.util.List;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.model.Article;

public class ArticlesProvider {
	
	private ArticleDao articleDao;

	public List<Article> getAllArticles() {
		
		return articleDao.getArticles();
	}

	public List<Article> getAllArticlesOfAuthor(long id) {
		
		return  articleDao.getArticlesByAuthor(id);
	}

	public Article getArticleByID(long idArticle) {
		
		return articleDao.getById(idArticle);
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

}
