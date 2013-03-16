package test.com.armandorv.publisher.business.authors;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.business.authors.AuthorsManager;
import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

public class AuthorManagerTest {

	private static Logger log = Logger.getLogger(AuthorManagerTest.class);
	private static AuthorsManager manager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		manager = context.getBean("authorsManager", AuthorsManager.class);
	}

	@Test
	public void createAuthorTest() {
		Author author = new Author();
		author.setName("Saul Isern");
		author.setSurname("Iserin");
		author.setDateOfJoining(new Date());
		User user = new User();
		user.setUserName("isern");
		user.setPassword("secret");
		user.setAuthor(author);
		manager.enrollAuthor(user, author);
		log.info("check db");
	}
	
	@Test
	public void modifyAuthorTest(){
		Author author = new Author();
		author.setName("Saul Isern");
		author.setSurname("Iserin Iserin");
		author.setDateOfJoining(new Date());
		author.setId(8);
		manager.modifyAuthor(author);
		log.info("check db");
	}
	@Test
	public void deleteAuthorTest(){
		manager.deleteAuthor(8);
	}

}
