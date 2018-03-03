package miniProjet.models;

public class Fonctionalite {
	
	private Long id;
	private String libelle;
	private String description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Fonctionalite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fonctionalite(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public Fonctionalite(Long id, String libelle, String description) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
	}
	
	

}
