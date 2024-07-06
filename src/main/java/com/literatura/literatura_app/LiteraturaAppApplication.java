package com.literatura.literatura_app;

import com.literatura.literatura_app.main.main;
import com.literatura.literatura_app.repository.AutorRepository;
import com.literatura.literatura_app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaAppApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		main main = new main(bookRepository,autorRepository);
		main.app();
	}
}
