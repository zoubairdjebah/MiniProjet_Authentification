package miniProjet.services;

import java.util.List;

import miniProjet.dao.GenericDaoImpl;
import miniProjet.dao.IGenericDao;
import miniProjet.models.User;

public class UserServiceImpl implements IUserService {

	private IGenericDao<User> dao = new GenericDaoImpl<User>();
	@Override
	public Long ajouter(User u) {
		return dao.insert(u);
	}

	@Override
	public boolean modifier(User u) {
		// TODO Auto-generated method stub
		return dao.update(u);
	}

	@Override
	public boolean supprimer(User u) {
		// TODO Auto-generated method stub
		return dao.delete(u);
	}

	@Override
	public List<User> chercher(User u) {
		// TODO Auto-generated method stub
		return dao.select(u);
	}

}
