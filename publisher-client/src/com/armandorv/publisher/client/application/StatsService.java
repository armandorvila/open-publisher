package com.armandorv.publisher.client.application;

import java.util.List;

import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.model.Author;

public class StatsService {

	public int getAuthorsNumber() {
		return EJBFactory.FACTORY.getAuthorsService().getAllAuthors().size();
	}

	public int getArticlesNumber() {
		return EJBFactory.FACTORY.getArticlesService().getAllArticles().size();
	}

	public Author getMvpAuthor() {
		List<Author> authors = EJBFactory.FACTORY.getAuthorsService()
				.getAllAuthors();
		ArticlesService service = EJBFactory.FACTORY.getArticlesService();
		int max = 0;
		Author mvp = null;
		for (Author author : authors) {
			int num = service.getAllArticlesOfAuthor(author.getId()).size();
			if (num > max) {
				max = num;
				mvp = author;
			}
		}
		return mvp;
	}
}
