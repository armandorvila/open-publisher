package com.armandorv.publisher.client.view.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;
import javax.swing.JTextField;

import com.armandorv.publisher.client.view.models.ArticlesListModel;
import com.armandorv.publisher.model.Article;

public class ArticleClickListener extends MouseAdapter {

	private ArticlesListModel model;
	private JList articlesList;
	private JTextField title;
	private JTextField subject;
	private JTextField description;
	private JTextField author;

	public ArticleClickListener(ArticlesListModel model, JList articlesList,
			JTextField title, JTextField subject, JTextField description,
			JTextField author) {
		this.model = model;
		this.articlesList = articlesList;
		this.title = title;
		this.author = author;
		this.description = description;
		this.subject = subject;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int index = this.articlesList.locationToIndex(e.getPoint());
		if(index>=0){
		Article article = model.getCurrentArticle(index);
		title.setText(article.getTitle());
		subject.setText(article.getSubject());
		description.setText(article.getDescription());
		author.setText(article.getAuthor());
		}
	}

}
