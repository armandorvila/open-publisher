package test.com.armandorv.pblisher.application;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.armandorv.publisher.application.BusinessFactory;
import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.business.AuthorsService;

public class BusinessFactoryTest {

	private static Logger log = Logger.getLogger(BusinessFactoryTest.class);

	@Test
	public void testGetArticlesService() {
		ArticlesService service = BusinessFactory.FACTORY.getArticlesService();
		Assert.assertNotNull(service);
		log.info(service);
		log.info(service.getAllArticles());
	}

	@Test
	public void testGetAuthorsService() {
		AuthorsService service = BusinessFactory.FACTORY.getAuthorsService();
		Assert.assertNotNull(service);
		log.info(service);
		log.info(service.getAllAuthors());
	}

}
