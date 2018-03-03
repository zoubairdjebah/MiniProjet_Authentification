package miniProjet.presentation;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import miniProjet.models.Profil;
import miniProjet.services.IProfilService;
import miniProjet.services.ProfilServiceImpl;

public class ProfilActions extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	IProfilService service = new ProfilServiceImpl();
	List<Profil> listP = new ArrayList<Profil>();
	private Profil bean;

	public Profil getBean() {
		return bean;
	}

	public void setBean(Profil bean) {
		this.bean = bean;
	}

	public String ajouter() {
		System.out.println("Methode EQ Action appelé bean: " + bean);

		Long id = service.ajouter(bean);
		if (id == null) {
			addActionMessage("Profil NOT INSERTED!!!");
			return ERROR;
		} else {
			addActionMessage("Profil  INSERTED!!! " + id);
			return SUCCESS;
		}

	}

	public String modifier() {
		System.out.println("Methode EQ Action appelé bean: " + bean);

		boolean r = service.modifier(bean);
		if (r) {
			addActionMessage("Profil UPDATED!!!");
			return SUCCESS;
		} else {
			addActionMessage("Profil  NOT UPDATED!!!");
			return ERROR;
		}

	}

	public String supprimer() {
		System.out.println("Methode EQ Action appelé bean: " + bean);

		boolean r = service.supprimer(bean);
		if (r) {
			addActionMessage("Profil DELETED ");
			return SUCCESS;
		} else {
			addActionMessage("Profil  NOT DELETED!!!");
			return ERROR;
		}

	}

	public String chercher() {
		listP = service.chercher(bean);

		return SUCCESS;

	}

	public List<Profil> getListP() {
		return listP;
	}

	public void setListP(List<Profil> listP) {
		this.listP = listP;
	}

}
