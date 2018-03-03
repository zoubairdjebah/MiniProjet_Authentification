

import org.displaytag.decorator.TableDecorator;

import miniProjet.models.User;

public class MyDecorator extends TableDecorator{
	
	public String getMyLink()
    {
        User user= (User) getCurrentRowObject();
        Long lId= user.getId();
        
        return "<a href=\"../pages/ModifierUser.jsp?idUtil=" + lId + "\" Class=\"btn btn-info btn-sm\" role=\"button\"><i class=\"glyphicon glyphicon-pencil\"></i>Modifier</a>";
        
        
    }

}
