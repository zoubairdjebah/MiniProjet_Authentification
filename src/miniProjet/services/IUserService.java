package miniProjet.services;

import java.util.List;

import miniProjet.models.User;

public interface IUserService {
	
	Long ajouter(User u);

	boolean modifier(User u);

	boolean supprimer(User u);

	List<User> chercher(User u);
}
