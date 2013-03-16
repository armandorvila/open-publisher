package test.com.armandorv.publisher.dataaccess.jdbc;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.dataaccess.jdbc.JdbcAuthorDao;
import com.armandorv.publisher.dataaccess.jdbc.JdbcUserDao;
import com.armandorv.publisher.model.Author;
import com.armandorv.publisher.model.User;

public class JdbcUserDaoTest {

	private static Logger log = Logger.getLogger(JdbcUserDaoTest.class);
	private static JdbcUserDao dao;
	private static JdbcAuthorDao adao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"dataAccessBeans.xml");
		dao = context.getBean("jdbcUserDao", JdbcUserDao.class);
		adao = context.getBean("jdbcAuthorDao", JdbcAuthorDao.class);
	}

	@Test
	public void createAndDeleteUserTest() {
		User user = new User();
		user.setUserName("pepe");
		user.setPassword("xxxx");
		Author a = new Author();
		a.setName("kike");
		a.setSurname("perez");
		a.setDateOfJoining(new Date());
		a.setId(adao.createAuthor(a));
		user.setAuthor(a);
		dao.createUser(user);
		log.info(dao.getUserByUserName(user.getUserName()));
		dao.delteUser(a.getId());

	}

}
