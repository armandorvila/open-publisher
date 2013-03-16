package test.com.armandorv.publisher.business.authors;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.business.authors.AuthorsProvider;

public class AuthorsProviderTest {

	private static Logger log = Logger.getLogger(AuthorsProviderTest.class);
	private static AuthorsProvider provider;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		provider = context.getBean("authorsProvider", AuthorsProvider.class);
	}

	@Test
	public void providerTest() {
		log.info(provider.getAllAuthors());
		log.info(provider.getAuthorByuserName("armandorv"));
		
	}

}
