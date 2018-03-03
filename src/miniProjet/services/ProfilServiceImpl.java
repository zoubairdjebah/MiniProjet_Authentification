package miniProjet.services;

import java.util.List;

import miniProjet.dao.GenericDaoImpl;
import miniProjet.dao.IGenericDao;
import miniProjet.models.Profil;

public class ProfilServiceImpl implements IProfilService {

	private IGenericDao<Profil> dao = new GenericDaoImpl<Profil>();
	
	@Override
	public Long ajouter(Profil p) {

		return dao.insert(p);
	}

	@Override
	public boolean modifier(Profil p) {
		
		return dao.update(p);
	}

	@Override
	public boolean supprimer(Profil p) {
		
		return dao.delete(p);
	}

	@Override
	public List<Profil> chercher(Profil p) {
		
		return dao.select(p);
	}

}
