package fr.issam.filmnotationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FilmNotationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmNotationServiceApplication.class, args);
	}

}
