package fr.issam.filmcatalogueservice.entities;

public class CatalogueArticles {
	
	private String nom;
	private String description;
	private int notation;
	
	public CatalogueArticles(String nom, String description, int notation) {
		super();
		this.nom = nom;
		this.description = description;
		this.notation = notation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNotation() {
		return notation;
	}

	public void setNotation(int notation) {
		this.notation = notation;
	}
	
	

}
