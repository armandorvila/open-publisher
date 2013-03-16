package test.com.armandorv.publisher.business.articles;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.business.articles.ArticlesManager;
import com.armandorv.publisher.model.Article;

public class ArticlesManagerTest {

	private static Logger log = Logger.getLogger(ArticlesManagerTest.class);
	private static ArticlesManager manager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		manager = context.getBean("articlesManager", ArticlesManager.class);
	}

	@Test
	public void publishTest() {
		Article article = new Article();
		article.setAuthor("Armando");
		article.setDateOfCreation(new Date());
		article.setDescription("bla bla");
		article.setFileName("my file.txt");
		article.setSubject("my subject");
		article.setTitle("article");
		article.setUrl("http://blabla");
		manager.publishArticle(1, article);
		log.info("All correct check db.");
	}

	@Test
	public void modifyArticleTest() {
		Article article = new Article();
		article.setId(11);
		article.setAuthor("Armando");
		article.setDateOfCreation(new Date());
		article.setDescription("Pepito perez by the Forest");
		article.setFileName("my file.txt");
		article.setSubject("my subject");
		article.setTitle("article");
		article.setUrl("http://blabla");
		manager.modifyArticle(article);
		log.info("All correct check db.");
	}

	@Test
	// Check id in db
	public void deleteArticleTest() {
		manager.deleteArticle(11);
		log.info("All correct check db.");
	}

}
