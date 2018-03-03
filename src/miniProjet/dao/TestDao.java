package miniProjet.dao;

import miniProjet.models.Fonctionalite;

public class TestDao {

	public static void main(String[] args) {
		
		IGenericDao<Fonctionalite> dao = new GenericDaoImpl<Fonctionalite>();
		
		Fonctionalite u = new Fonctionalite("Admin","Administrateur system");
		
		dao.insert(u);
	}

}
