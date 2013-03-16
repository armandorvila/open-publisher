package com.armandorv.publisher.business.articles;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.model.Article;

public class ArticlesManager {

	private ArticleDao articleDao;
	private AuthorDao authorDao;

	public void publishArticle(long idAuthor, Article article) {
		long id = articleDao.createArticle(article);
		article.setId(id);
		authorDao.addArticle(idAuthor, article.getId());

	}

	public void modifyArticle(Article article) {
		articleDao.modifyArticle(article);

	}

	public void deleteArticle(long idArticle) {
		articleDao.deleteArticle(idArticle);

	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

}
