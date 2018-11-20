package com.example.demo;

import com.example.demo.model.Album;
import com.example.demo.repository.AlbumDAO;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public CommandLineRunner demo(AlbumDAO albumRepository) {
		return (args) -> {
			// save a couple of customers
			albumRepository.save(new Album("Album 1"));
			albumRepository.save(new Album("Album 2"));
			albumRepository.save(new Album("Album 3"));
		};
	}

}
