using WSClientPublisher.Business.Articles;

namespace WSClientPublisher.Commands
{
   public class ModifyArticle
    {
       public void execute(article article)
       {
           ArticlesService service = new ArticlesServiceClient();
           modifyArticleRequest modifyReq = new modifyArticleRequest();
           modifyReq.modifyArticle = new modifyArticle();
           modifyReq.modifyArticle.arg0 = article;
           service.modifyArticle(modifyReq);
       }
    }
}
