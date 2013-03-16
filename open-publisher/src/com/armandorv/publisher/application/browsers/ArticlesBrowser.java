package com.armandorv.publisher.application.browsers;

import java.util.List;

import com.armandorv.publisher.model.Article;

public interface ArticlesBrowser {

	public List<Article> getArticlesByKeyWord(String key);

	public List<Article> getArticlesByTitle(String title);

	public List<Article> getArticlesBySubject(String subject);

	public List<Article> getArticlesByAuthorName(String name);

	public List<Article> getArticlesByKeyWord(long id, String key);

	public List<Article> getArticlesByTitle(long id,
			String title);

	public List<Article> getArticlesBySubject(long id,
			String subject);


}
