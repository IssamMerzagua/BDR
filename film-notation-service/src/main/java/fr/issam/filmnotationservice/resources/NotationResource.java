package fr.issam.filmnotationservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.issam.filmnotationservice.entities.Notation;
import fr.issam.filmnotationservice.entities.UserNotation;

@RestController
@RequestMapping("/notations")
public class NotationResource {

	@RequestMapping("/{filmId}")
	public Notation getNotation(@PathVariable("filmId") String filmId) {
		
		return new Notation(filmId, 5);
	}
	
	@RequestMapping("users/{userId}")
	public UserNotation getUserNotation(@PathVariable("userId") String userId) {
		
		List<Notation> notations = Arrays.asList(

				new Notation("000", 9),
				new Notation("111", 7)
		);
		
		UserNotation userNotation = new UserNotation();
		userNotation.setUserNotation(notations);
		return userNotation;
	}
	
}
