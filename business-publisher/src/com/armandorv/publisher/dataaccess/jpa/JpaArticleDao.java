package com.armandorv.publisher.dataaccess.jpa;

import java.util.List;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.model.Article;

//@Stateless @Local
public class JpaArticleDao implements ArticleDao {

	//@PersistenceContext
  //  private EntityManager em;
	
	@Override
	public long createArticle(Article article) {
	//	em.persist(article);
		//Article a =  em.find(Article.class, article);
		//return a.getId();
		return 0;
	}

	@Override
	public void modifyArticle(Article article) {

	}

	@Override
	public void deleteArticle(long id) {

	}

	@Override
	public Article getById(long id) {
	return null;
	}
	@Override
	public List<Article> getArticles() {
		return null;
	}


	@Override
	public List<Article> getArticlesByAuthor(long id) {
		return null;
	}

}
