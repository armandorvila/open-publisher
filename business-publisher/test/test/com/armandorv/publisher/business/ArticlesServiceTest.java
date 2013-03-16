package test.com.armandorv.publisher.business;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.armandorv.publisher.business.ArticlesService;
import com.armandorv.publisher.business.articles.EjbArticlesService;

public class ArticlesServiceTest {

	private static Logger log = Logger.getLogger(ArticlesServiceTest.class);
	private static ArticlesService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new EjbArticlesService();
	}
	
	@Test
	public void test(){
		Assert.assertNotNull(service);
		log.debug(service.getAllArticles());
		service.deleteArticle(5);
	}

}
