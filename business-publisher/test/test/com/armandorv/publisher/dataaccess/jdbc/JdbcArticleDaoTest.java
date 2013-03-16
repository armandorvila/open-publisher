package test.com.armandorv.publisher.dataaccess.jdbc;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.dataaccess.jdbc.JdbcArticleDao;
import com.armandorv.publisher.model.Article;

public class JdbcArticleDaoTest {

	private static Logger log = Logger.getLogger(JdbcArticleDaoTest.class);
	private static JdbcArticleDao articleDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"dataAccessBeans.xml");
		articleDao = context.getBean("jdbcArticleDao", JdbcArticleDao.class);
	}
	
	@Test
	public void testCreateAndDeleteArticle() {
		Article article = new Article();
		article.setAuthor("frodo bolson");
		article.setTitle("El anillo");
		article.setDateOfCreation(new Date());
		article.setFileName("elanilllo.txt");
		article.setUrl("http:eeee");
		article.setSubject("T");
		article.setDescription("sdsdsd");

		long id = articleDao.createArticle(article);
		log.info("Cretaed :" + id);
		articleDao.deleteArticle(id);

	}
	@Test
	public void testGetArticles() {
		List<Article> articles = articleDao.getArticles();
		log.info(articles);
		if(articles.size()>=1){
		long lastid = articles.get(articles.size() - 1).getId();
		log.info(articleDao.getById(lastid));
		}
		else log.info("No articles");
	}
}
