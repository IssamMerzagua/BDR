package fr.issam.filmcatalogueservice.entities;

import java.util.List;

public class UserNotation {
	
	private List<Notation> userNotation;

	public UserNotation() {

	}
	
	public UserNotation(List<Notation> userNotation) {
		super();
		this.userNotation = userNotation;
	}

	public List<Notation> getUserNotation() {
		return userNotation;
	}

	public void setUserNotation(List<Notation> userNotation) {
		this.userNotation = userNotation;
	}
	

}
