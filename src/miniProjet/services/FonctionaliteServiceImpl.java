package miniProjet.services;

import java.util.List;

import miniProjet.dao.GenericDaoImpl;
import miniProjet.dao.IGenericDao;
import miniProjet.models.Fonctionalite;

public class FonctionaliteServiceImpl implements IFonctionaliteService {

	private IGenericDao<Fonctionalite> dao = new GenericDaoImpl<Fonctionalite>();
	
	@Override
	public Long ajouter(Fonctionalite f) {

		return dao.insert(f);
	}

	@Override
	public boolean modifier(Fonctionalite f) {
		
		return dao.update(f);
	}

	@Override
	public boolean supprimer(Fonctionalite f) {
		
		return dao.delete(f);
	}

	@Override
	public List<Fonctionalite> chercher(Fonctionalite f) {
		
		return dao.select(f);
	}

}
