package miniProjet.presentation;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import miniProjet.models.User;
import miniProjet.services.IUserService;
import miniProjet.services.UserServiceImpl;

@SuppressWarnings("serial")
public class UserActions extends ActionSupport{
	
	IUserService service = new UserServiceImpl();
	List<User> listP = new ArrayList<User>();
	private User bean;

	public User getBean() {
		return bean;
	}

	public void setBean(User bean) {
		this.bean = bean;
	}

	public String ajouter() {
		System.out.println("Methode EQ Action appelé bean: " + bean);

		Long id = service.ajouter(bean);
		if (id == null) {
			addActionMessage("User NOT INSERTED!!!");
			return ERROR;
		} else {
			addActionMessage("User  INSERTED!!! " + id);
			return SUCCESS;
		}

	}

	public String modifier() {
		System.out.println("Methode EQ Action appelé bean: " + bean);

		boolean r = service.modifier(bean);
		if (r) {
			addActionMessage("User UPDATED!!!");
			return SUCCESS;
		} else {
			addActionMessage("User  NOT UPDATED!!!");
			return ERROR;
		}

	}

	public String supprimer() {
		System.out.println("Methode EQ Action appelé bean: " + bean);

		boolean r = service.supprimer(bean);
		if (r) {
			addActionMessage("User DELETED ");
			return SUCCESS;
		} else {
			addActionMessage("User  NOT DELETED!!!");
			return ERROR;
		}

	}

	public String chercher() {
		listP = service.chercher(bean);

		return SUCCESS;

	}

	public List<User> getListP() {
		return listP;
	}

	public void setListP(List<User> listP) {
		this.listP = listP;
	}

}
