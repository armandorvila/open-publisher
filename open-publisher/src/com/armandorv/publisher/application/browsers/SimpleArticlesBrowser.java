package com.armandorv.publisher.application.browsers;

import java.util.ArrayList;
import java.util.List;

import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Article;

public class SimpleArticlesBrowser implements ArticlesBrowser {

	private ArticlesService service;

	public void setService(ArticlesService service) {
		this.service = service;
	}

	@Override
	public List<Article> getArticlesByKeyWord(String key) {
		List<Article> articles = service.getAllArticles();
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getAuthor().contains(key)
					|| article.getTitle().contains(key)
					|| article.getSubject().contains(key)
					|| article.getFileName().contains(key)) {
				solution.add(article);
			}
		}
		return solution;
	}

	@Override
	public List<Article> getArticlesByTitle(String title) {
		List<Article> articles = service.getAllArticles();
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getTitle().contains(title)) {
				solution.add(article);
			}
		}
		return solution;
	}

	@Override
	public List<Article> getArticlesBySubject(String subject) {
		List<Article> articles = service.getAllArticles();
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getSubject().contains(subject)) {
				solution.add(article);
			}
		}
		return solution;
	}

	@Override
	public List<Article> getArticlesByAuthorName(String name) {
		List<Article> articles = service.getAllArticles();
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getAuthor().contains(name)) {
				solution.add(article);
			}
		}
		return solution;
	}

	@Override
	public List<Article> getArticlesByKeyWord(long id, String key) {
		List<Article> articles = service.getAllArticlesOfAuthor(id);
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getAuthor().contains(key)
					|| article.getTitle().contains(key)
					|| article.getSubject().contains(key)
					|| article.getFileName().contains(key)) {
				solution.add(article);
			}
		}
		return solution;
	}

	@Override
	public List<Article> getArticlesByTitle(long id, String title) {
		List<Article> articles = service.getAllArticlesOfAuthor(id);
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getTitle().contains(title)) {
				solution.add(article);
			}
		}
		return solution;
	}

	@Override
	public List<Article> getArticlesBySubject(long id, String subject) {
		List<Article> articles = service.getAllArticlesOfAuthor(id);
		List<Article> solution = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.getSubject().contains(subject)) {
				solution.add(article);
			}
		}
		return solution;
	}

}
