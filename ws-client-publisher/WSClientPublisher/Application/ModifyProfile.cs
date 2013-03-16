
using WSClientPublisher.Business.Authors;
namespace WSClientPublisher.Commands
{
   public class ModifyProfile
    {

       public void execute(author newAuthor)
       {
           AuthorsService service = new AuthorsServiceClient();
           modifyAuthorRequest request = new modifyAuthorRequest();
           request.modifyAuthor = new modifyAuthor();
           request.modifyAuthor.arg0 = newAuthor;
           service.modifyAuthor(request);
       }

    }
}
