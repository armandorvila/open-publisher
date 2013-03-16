package test.com.armandorv.publisher.dataaccess;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.dataaccess.ArticleDao;
import com.armandorv.publisher.dataaccess.AuthorDao;
import com.armandorv.publisher.dataaccess.UserDao;

/**
 * Get one dao of the abstract factory to check it.
 * 
 * @author armandorv
 * 
 */
public class FactoriesTest {

	private static Logger log = Logger.getLogger(FactoriesTest.class);
	private static ArticleDao articleDao;
	private static AuthorDao authorDao;
	private static UserDao userDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"dataAccessBeans.xml");
		articleDao = context.getBean("articleDao", ArticleDao.class);
		authorDao = context.getBean("authorDao", AuthorDao.class);
		userDao = context.getBean("userDao", UserDao.class);
	}

	@Test
	public void articleDaoTest() {
		Assert.assertNotNull(articleDao);
		log.info(articleDao.getArticles());
	}

	@Test
	public void authorDaoTest() {
		Assert.assertNotNull(authorDao);
		log.info(authorDao.getAuthors());
	}

	@Test
	public void userDaoTest() {
		Assert.assertNotNull(userDao);
		log.info(userDao.getUserByUserName("armandorv"));
	}
}
