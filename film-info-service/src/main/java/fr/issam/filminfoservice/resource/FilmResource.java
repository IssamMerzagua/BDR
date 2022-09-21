package fr.issam.filminfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.issam.filminfoservice.entities.Film;

@RestController
@RequestMapping("/films")
public class FilmResource {
	
	@RequestMapping("/{filmId}")
	public Film getFilmInfo(@PathVariable("filmId") String filmId) {
		
		return new Film(filmId, "nom TEST");
	}

}
