package test.com.armandorv.publisher.dataaccess.sql;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.dataaccess.jdbc.sql.ArticleSQLWrapping;
import com.armandorv.publisher.dataaccess.jdbc.sql.AuthorSQLWrapping;
import com.armandorv.publisher.dataaccess.jdbc.sql.UserSQLWrapping;

public class SqlWrappingTest {

	private static Logger log = Logger.getLogger(SqlWrappingTest.class);
	private static ArticleSQLWrapping articleSqlProvider;
	private static AuthorSQLWrapping authorSqlProvider;
	private static UserSQLWrapping userSqlProvider;

	@BeforeClass
	public static void beforeClass() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"sqlProviderBeans.xml");
		articleSqlProvider = context.getBean("articleSqlProvider",
				ArticleSQLWrapping.class);
		authorSqlProvider = context.getBean("authorSqlProvider",
				AuthorSQLWrapping.class);
		userSqlProvider = context.getBean("userSqlProvider",
				UserSQLWrapping.class);
	}

	@Test
	public void articleProviderTest() {
		log.info(articleSqlProvider.getCreate());
		log.info(articleSqlProvider.getDelete());
		log.info(articleSqlProvider.getModify());
		log.info(articleSqlProvider.getGetAll());
		log.info(articleSqlProvider.getGetById());
	}

	@Test
	public void authorroviderTest() {
		log.info(authorSqlProvider.getCreate());
		log.info(authorSqlProvider.getModify());
		log.info(authorSqlProvider.getDelete());
		log.info(authorSqlProvider.getGetById());
		log.info(authorSqlProvider.getGetAll());
	}

	@Test
	public void articlesProviderTest() {
		log.info(userSqlProvider.getCreate());
		log.info(userSqlProvider.getModify());
		log.info(userSqlProvider.getDelete());
		log.info(userSqlProvider.getGetByUserName());
	}

}
