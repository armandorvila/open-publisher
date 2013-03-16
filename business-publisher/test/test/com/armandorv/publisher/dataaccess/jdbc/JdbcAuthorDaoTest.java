package test.com.armandorv.publisher.dataaccess.jdbc;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.dataaccess.jdbc.JdbcAuthorDao;
import com.armandorv.publisher.model.Author;

public class JdbcAuthorDaoTest {

	private static Logger log = Logger.getLogger(JdbcArticleDaoTest.class);
	private static JdbcAuthorDao authorDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"dataAccessBeans.xml");
		authorDao = context.getBean("jdbcAuthorDao", JdbcAuthorDao.class);
	}

	@Test
	public void createAndDeleteAuthorTest() {
		Author author = new Author();
		author.setName("Arm");
		author.setSurname("Ra");
		author.setDateOfJoining(new Date());
		long id = authorDao.createAuthor(author);
		log.info("Created " + id);

		authorDao.deleteAuthor(id);

	}
	@Test
	public void getAuthorsTest() {
		log.info(authorDao.getAuthors());
	}

}
