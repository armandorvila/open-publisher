using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using WSClientPublisher.Business.Articles;

namespace WSClientPublisher.Commands
{
    public class GetArticleByID
    {
        public article execute(long id)
        {
            ArticlesService service = new ArticlesServiceClient();
            getArticleByIDRequest request = new getArticleByIDRequest();
            getArticleByID wsparam = new getArticleByID();
            wsparam.arg0 = id;
            request.getArticleByID = wsparam;
            getArticleByIDResponse1 response = service.getArticleByID(request);

            return response.getArticleByIDResponse.@return;

        }
    }
}
