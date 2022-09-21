package fr.issam.filmcatalogueservice.entities;

public class Notation {

	private String filmId;
	private int note;
	
	public Notation() {

	}
	
	public Notation(String filmId, int note) {
		super();
		this.filmId = filmId;
		this.note = note;
	}

	public String getFilmId() {
		return filmId;
	}

	public void setFilmId(String filmId) {
		this.filmId = filmId;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
}
