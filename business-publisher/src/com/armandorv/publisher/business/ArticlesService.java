package com.armandorv.publisher.business;

import java.util.List;

import com.armandorv.publisher.model.Article;


public interface ArticlesService {

	public void publishArticle(long idAuthor, Article article);

	public void modifyArticle(Article article);

	public void deleteArticle(long idArticle);

	public Article getArticleByID(long idArticle);

	public List<Article> getAllArticles();

	public List<Article> getAllArticlesOfAuthor(long id);




}
