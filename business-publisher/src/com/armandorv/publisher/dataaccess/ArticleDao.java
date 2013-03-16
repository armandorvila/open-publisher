package com.armandorv.publisher.dataaccess;

import java.util.List;

import com.armandorv.publisher.model.Article;

public interface ArticleDao {

	public long createArticle(Article article);

	public void modifyArticle(Article article);

	public void deleteArticle(long id);

	public Article getById(long id);

	public List<Article> getArticles();

	public List<Article> getArticlesByAuthor(long id);

}
