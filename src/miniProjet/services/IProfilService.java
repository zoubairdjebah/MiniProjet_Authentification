package miniProjet.services;

import java.util.List;

import miniProjet.models.Profil;

public interface IProfilService {
	
	Long ajouter(Profil p);

	boolean modifier(Profil p);

	boolean supprimer(Profil p);

	List<Profil> chercher(Profil p);
}
