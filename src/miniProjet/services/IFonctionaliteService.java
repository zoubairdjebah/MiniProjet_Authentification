package miniProjet.services;

import java.util.List;

import miniProjet.models.Fonctionalite;

public interface IFonctionaliteService {
	
	Long ajouter(Fonctionalite f);

	boolean modifier(Fonctionalite f);

	boolean supprimer(Fonctionalite f);

	List<Fonctionalite> chercher(Fonctionalite f);
}
