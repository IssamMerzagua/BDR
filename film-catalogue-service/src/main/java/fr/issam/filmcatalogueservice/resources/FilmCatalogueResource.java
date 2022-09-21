package fr.issam.filmcatalogueservice.resources;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import fr.issam.filmcatalogueservice.entities.CatalogueArticles;
import fr.issam.filmcatalogueservice.entities.Film;
import fr.issam.filmcatalogueservice.entities.Notation;
import fr.issam.filmcatalogueservice.entities.UserNotation;

@RestController
@RequestMapping("/catalogue")
public class FilmCatalogueResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogueArticles> getCatalogue(@PathVariable("userId") String userId){
		
		// retourner tous les films notés
		UserNotation notations = restTemplate.getForObject("http://localhost:8083/notations/users/" + userId, UserNotation.class);
		
		return notations.getUserNotation().stream().map(notation -> { 
			
			// pour chaque ID de film, on appelle FilmInfoService et obtient les détails
			Film film = restTemplate.getForObject("http://localhost:8082/films/" + notation.getFilmId() , Film.class);
			
			// nous les mettons tous ensemble
			return new CatalogueArticles(film.getNom(), "description...", notation.getNote());
			})
			.collect(Collectors.toList());
		
		
	/*	Collections.singletonList(new CatalogueArticles("Blow", "Johhny Depp's movie 2001", 10));
		Film film = webClientBuilder
		.build()
		.get()
		.uri("http://localhost:8082/films/" + notation.getFilmId())
		.retrieve()
		.bodyToMono(Film.class)
		.block();
	*/
		
	}

}
