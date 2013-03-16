package com.armandorv.publisher.client.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import com.armandorv.publisher.client.view.builders.articles.ArticlesJLBuilder;
import com.armandorv.publisher.client.view.builders.articles.ArticlesJTBuilder;
import com.armandorv.publisher.client.view.builders.authors.AuthorsJLBuilder;
import com.armandorv.publisher.client.view.builders.authors.AuthorsJTBuilder;
import com.armandorv.publisher.client.view.builders.stats.StatsJLBuilder;
import com.armandorv.publisher.client.view.builders.stats.StatsJTBuilder;
import com.armandorv.publisher.client.view.listeners.ArticleClickListener;
import com.armandorv.publisher.client.view.listeners.AuthorClickListener;
import com.armandorv.publisher.client.view.listeners.DeleteArticle;
import com.armandorv.publisher.client.view.listeners.DeleteAuthor;
import com.armandorv.publisher.client.view.models.ArticlesListModel;
import com.armandorv.publisher.client.view.models.AuthorsListModel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -7794610258669847945L;

	private JPanel contentPane;
	private JPanel stats_panel;
	private JPanel articles_panel;
	private JPanel authors_panel;
	private JTextField tfStatsAuthors;
	private JTextField tfStatsArticles;
	private JTextField tfStatsMvpAuthor;
	private JTextField textField_Name;
	private JTextField textField_SurName;
	private JTextField textField_DateOfJoining;
	private JTextField textField_title;
	private JTextField textField_subject;
	private JTextField textField_desc;
	private JTextField textField_author;

	public MainFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 429);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 611, 375);
		this.contentPane.add(tabbedPane);
		/*Building Stats Panel*/
		this.stats_panel = new JPanel();
		this.stats_panel.addMouseListener(new StatsPaneEnter());
		tabbedPane.addTab("Stats", null, stats_panel, null);
		this.initStatsPanel();
		/*Building Articles Panel*/
		this.articles_panel = new JPanel();
		tabbedPane.addTab("Articles", null, articles_panel, null);
		this.initArticlesPanel();
		/*Building Authors Panel*/
		this.authors_panel = new JPanel();
		tabbedPane.addTab("Authors", null, authors_panel, null);
		this.initAuthorsPanel();

	}

	private void initStatsPanel() {
		this.stats_panel.setLayout(null);
		/* Building JLabels */
		this.stats_panel.add(StatsJLBuilder.getTitleStatsJLabel());
		this.stats_panel.add(StatsJLBuilder.getAuthorsStatsJlabel());
		this.stats_panel.add(StatsJLBuilder.getArticlesStatsJlabel());
		this.stats_panel.add(StatsJLBuilder.getMVPAuthorStatsJlabel());
		this.stats_panel.add(StatsJLBuilder.getDateJLabel());
		/* Building JTexts */
		this.tfStatsAuthors = StatsJTBuilder.getAuthorsStatsTextField();
		this.stats_panel.add(tfStatsAuthors);
		this.tfStatsArticles = StatsJTBuilder.getArticlesStatsTextField();
		this.stats_panel.add(tfStatsArticles);
		this.tfStatsMvpAuthor = StatsJTBuilder.getMVPAuthorStatsTextField();
		this.stats_panel.add(tfStatsMvpAuthor);
	}

	private void initArticlesPanel() {
		this.articles_panel.setLayout(null);
		
		/* Building JLabels */
		this.articles_panel.add(ArticlesJLBuilder
				.getArticlesManagementJLabel());
		this.articles_panel.add(ArticlesJLBuilder.getTitleJlabel());
		this.articles_panel.add(ArticlesJLBuilder.getADescriptionJlabel());
		this.articles_panel.add(ArticlesJLBuilder.getSubjectJlabel());
		this.articles_panel.add(ArticlesJLBuilder.getAuthorJLabel());

		/* Building JTexts */
		this.textField_title = ArticlesJTBuilder.getTitleJTextField();
		this.articles_panel.add(textField_title);
		this.textField_subject = ArticlesJTBuilder.getSubjectJTextField();
		this.articles_panel.add(textField_subject);
		this.textField_desc = ArticlesJTBuilder.getDescriptionJTextField();
		this.articles_panel.add(textField_desc);
		this.textField_author = ArticlesJTBuilder.getAuthorJTextField();
		this.articles_panel.add(textField_author);
		
		/*Creating Scroll Panel TODO Redesign*/
		JScrollPane scrollPanelArticles = new JScrollPane();
		scrollPanelArticles.setBounds(10, 81, 158, 185);
		this.articles_panel.add(scrollPanelArticles);
		JList articlesList = new JList();
		articlesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ArticlesListModel articlesModel = new ArticlesListModel();
		articlesList.setModel(articlesModel);
		articlesList.addMouseListener(new ArticleClickListener(articlesModel,
				articlesList, textField_title, textField_subject,
				textField_desc, textField_author));
		scrollPanelArticles.setViewportView(articlesList);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new DeleteArticle(articlesList,
				articlesModel));
		btnDelete.setBounds(267, 272, 89, 23);
		articles_panel.add(btnDelete);
	}

	private void initAuthorsPanel() {
		this.authors_panel.setLayout(null);

		/* Buildings JLabels */
		this.authors_panel.add(AuthorsJLBuilder
				.getAuthorsManagementJLabel());
		this.authors_panel.add(AuthorsJLBuilder.getNameJLabel());
		this.authors_panel.add(AuthorsJLBuilder.getSurnameJLabel());
		this.authors_panel.add(AuthorsJLBuilder.getUsernameJLabel());

		/* Buildings JLTextfields */
		this.textField_Name = AuthorsJTBuilder.getNameJTextField();
		this.authors_panel.add(textField_Name);
		this.textField_SurName = AuthorsJTBuilder.getSurnameJTextField();
		this.authors_panel.add(textField_SurName);
		this.textField_DateOfJoining = AuthorsJTBuilder.getDateOfJoiningJTextField();
		this.authors_panel.add(textField_DateOfJoining);
		
		/*Creating Scroll Panel TODO Redesign*/
		JScrollPane scrollPanelAuthors = new JScrollPane();
		scrollPanelAuthors.setBounds(10, 84, 155, 185);
		this.authors_panel.add(scrollPanelAuthors);

		JList authorsList = new JList();
		scrollPanelAuthors.setViewportView(authorsList);
		authorsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		AuthorsListModel model = new AuthorsListModel();
		authorsList.setModel(model);
		authorsList.addMouseListener(new AuthorClickListener(model,
				authorsList, textField_Name, textField_SurName,
				textField_DateOfJoining));

		authorsList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new DeleteAuthor(authorsList, model));
		btnDelete.setBounds(267, 272, 89, 23);
		authors_panel.add(btnDelete);
	}

	/**
	 * Class to manage the event of mouse enter into stats panel.
	 * 
	 * @author armandorv
	 * 
	 */
	private class StatsPaneEnter extends MouseAdapter {

		@Override
		public void mouseEntered(MouseEvent e) {
			initStatsPanel();
		}
	}
}
