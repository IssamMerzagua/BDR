package fr.issam.filmcatalogueservice.entities;

public class Film {

	private String FilmId;
	private String nom;
	
	public Film() {

	}
	
	public Film(String filmId, String nom) {
		super();
		FilmId = filmId;
		this.nom = nom;
	}

	public String getFilmId() {
		return FilmId;
	}

	public void setFilmId(String filmId) {
		FilmId = filmId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
