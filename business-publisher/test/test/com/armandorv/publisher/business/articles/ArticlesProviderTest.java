package test.com.armandorv.publisher.business.articles;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.armandorv.publisher.business.articles.ArticlesProvider;

public class ArticlesProviderTest {

	private static Logger log = Logger.getLogger(ArticlesProviderTest.class);
	private static ArticlesProvider provider;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"businessBeans.xml");
		provider = context.getBean("articlesProvider", ArticlesProvider.class);
	}

	@Test
	public void providerTest() {
		log.info(provider.getAllArticles());
		log.info(provider.getAllArticlesOfAuthor(1));
		log.info(provider.getArticleByID(2));
	}

}
