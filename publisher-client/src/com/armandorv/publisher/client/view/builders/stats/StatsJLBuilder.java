package com.armandorv.publisher.client.view.builders.stats;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Builder of JLabel objects for statics view.
 * 
 * @author armandorv
 * 
 */
public class StatsJLBuilder {

	public static JLabel getTitleStatsJLabel() {
		JLabel stats_title = new JLabel("System Stats");
		stats_title.setFont(new Font("Serif", Font.BOLD, 24));
		stats_title.setBounds(23, 11, 198, 27);
		stats_title.setHorizontalAlignment(SwingConstants.LEFT);
		return stats_title;
	}

	public static JLabel getArticlesStatsJlabel() {
		JLabel lblArticles = new JLabel("Articles:");
		lblArticles.setFont(new Font("Serif", Font.BOLD, 14));
		lblArticles.setBounds(29, 154, 95, 14);
		return lblArticles;
	}

	public static JLabel getAuthorsStatsJlabel() {
		JLabel lblAuthors = new JLabel("Authors:");
		lblAuthors.setFont(new Font("Serif", Font.BOLD, 14));
		lblAuthors.setBounds(32, 97, 92, 14);

		return lblAuthors;
	}

	public static JLabel getMVPAuthorStatsJlabel() {
		JLabel lblMvpAuthor = new JLabel("MVP Author:\r\n");
		lblMvpAuthor.setFont(new Font("Serif", Font.BOLD, 14));
		lblMvpAuthor.setBounds(29, 206, 95, 14);
		return lblMvpAuthor;
	}

	public static JLabel getDateJLabel() {
		JLabel lblDate = new JLabel("Date");
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/aaaa");

		lblDate.setFont(new Font("Serif", Font.BOLD, 14));
		lblDate.setBounds(513, 322, 80, 14);
		lblDate.setText(sf.format(new Date()));

		return lblDate;
	}

}
