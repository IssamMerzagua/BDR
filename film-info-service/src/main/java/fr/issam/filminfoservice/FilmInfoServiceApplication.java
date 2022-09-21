package fr.issam.filminfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FilmInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmInfoServiceApplication.class, args);
	}

}
