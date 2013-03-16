package com.armandorv.publisher.client.view.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.client.application.EJBFactory;
import com.armandorv.publisher.client.view.models.ArticlesListModel;
import com.armandorv.publisher.model.Article;

public class DeleteArticle implements ActionListener {

	private JList articlesList;
	private ArticlesListModel articlesModel;

	public DeleteArticle(JList articlesList, ArticlesListModel articlesModel) {
		this.articlesList = articlesList;
		this.articlesModel = articlesModel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int [] index = articlesList.getSelectedIndices();
		if (index.length > 0) {
			Article article = articlesModel.getCurrentArticle(index[0]);
			ArticlesService service = EJBFactory.FACTORY.getArticlesService();
			service.deleteArticle(article.getId());
			articlesList.setModel(new ArticlesListModel());
		}
	}

}
