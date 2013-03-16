using WSClientPublisher.Business.Articles;

namespace WSClientPublisher.Commands
{
    public class GetAllArticlesOfAuthor
    {

        public article [] execute(long id)
        {
            ArticlesService service = new ArticlesServiceClient();
            getAllArticlesOfAuthorRequest request = new getAllArticlesOfAuthorRequest();
            getAllArticlesOfAuthor wsparam = new getAllArticlesOfAuthor();
            wsparam.arg0 = id;
            request.getAllArticlesOfAuthor = wsparam;
            getAllArticlesOfAuthorResponse response = service.getAllArticlesOfAuthor(request);
            article[] articles = response.getAllArticlesOfAuthorResponse1;
            return articles;
       
        }
    }
}
