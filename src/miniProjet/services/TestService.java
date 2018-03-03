package miniProjet.services;

import miniProjet.models.Fonctionalite;

public class TestService {

	public static void main(String[] args) {

		IFonctionaliteService service = new FonctionaliteServiceImpl();
		
		Fonctionalite u = new Fonctionalite("Admin1","Administrateur system");
		
		service.ajouter(u);

	}

}
