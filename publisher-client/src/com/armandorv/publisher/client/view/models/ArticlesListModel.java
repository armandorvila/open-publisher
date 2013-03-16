package com.armandorv.publisher.client.view.models;

import java.util.List;

import javax.swing.AbstractListModel;

import com.armandorv.publisher.client.application.EJBFactory;
import com.armandorv.publisher.model.Article;

public class ArticlesListModel extends AbstractListModel {

	private static final long serialVersionUID = -3846073808095753730L;

	private List<Article> articles;

	public ArticlesListModel() {
		this.articles = EJBFactory.FACTORY.getArticlesService()
				.getAllArticles();
	}

	@Override
	public int getSize() {

		return articles.size();
	}

	@Override
	public Object getElementAt(int index) {

		return articles.get(index).getTitle();
	}

	public Article getCurrentArticle(int index) {
		return articles.get(index);
	}

}
