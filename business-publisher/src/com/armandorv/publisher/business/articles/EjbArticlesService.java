package com.armandorv.publisher.business.articles;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.model.Article;

@Stateless
@WebService(name="ArticlesService")
public class EjbArticlesService implements ArticlesServiceLocal,
		ArticlesServiceRemote {

	private ArticlesProvider provider;
	private ArticlesManager manager;

	public EjbArticlesService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		this.manager = context.getBean(ArticlesManager.class);
		this.provider = context.getBean(ArticlesProvider.class);
	}

	@Override
	public void publishArticle(long idAuthor, Article article) {
		manager.publishArticle(idAuthor, article);

	}

	@Override
	public void modifyArticle(Article article) {
		manager.modifyArticle(article);

	}

	@Override
	public void deleteArticle(long idArticle) {
		manager.deleteArticle(idArticle);

	}

	@Override
	public Article getArticleByID(long idArticle) {

		return provider.getArticleByID(idArticle);
	}

	@Override
	public List<Article> getAllArticles() {

		return provider.getAllArticles();
	}

	@Override
	public List<Article> getAllArticlesOfAuthor(long id) {

		return provider.getAllArticlesOfAuthor(id);
	}

}
