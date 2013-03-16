package com.armandorv.publisher.client.view.builders.stats;

import javax.swing.JTextField;

import com.armandorv.publisher.client.application.ServiceFactory;
import com.armandorv.publisher.model.Author;

public class StatsJTBuilder {

	public static JTextField getAuthorsStatsTextField() {
		JTextField tfStatsAuthors = new JTextField();

		tfStatsAuthors.setEditable(false);
		tfStatsAuthors.setBounds(233, 91, 86, 20);
		tfStatsAuthors.setText(ServiceFactory.FACTORY.getStatsService()
				.getAuthorsNumber() + "");
		tfStatsAuthors.setColumns(10);

		return tfStatsAuthors;
	}

	public static JTextField getArticlesStatsTextField() {
		JTextField tfStatsArticles = new JTextField();

		tfStatsArticles.setEditable(false);
		tfStatsArticles.setBounds(233, 148, 86, 20);
		tfStatsArticles.setText(ServiceFactory.FACTORY.getStatsService()
				.getArticlesNumber() + "");
		tfStatsArticles.setColumns(10);
		return tfStatsArticles;
	}

	public static JTextField getMVPAuthorStatsTextField() {
		JTextField tfStatsMvpAuthor = new JTextField();

		tfStatsMvpAuthor.setEditable(false);
		tfStatsMvpAuthor.setBounds(233, 200, 86, 20);
		Author mvp = ServiceFactory.FACTORY.getStatsService().getMvpAuthor();
		if (mvp != null)
			tfStatsMvpAuthor.setText(mvp.getName());
		else
			tfStatsMvpAuthor.setText("None");
		tfStatsMvpAuthor.setColumns(10);

		return tfStatsMvpAuthor;
	}
}
