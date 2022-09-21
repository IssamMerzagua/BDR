package fr.issam.filmnotationservice.entities;

import java.util.List;

public class UserNotation {
	
	private List<Notation> userNotation;

	public List<Notation> getUserNotation() {
		return userNotation;
	}

	public void setUserNotation(List<Notation> userNotation) {
		this.userNotation = userNotation;
	}
	

}
