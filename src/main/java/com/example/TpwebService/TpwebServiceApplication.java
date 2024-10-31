package com.example.TpwebService;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.TpwebService.entite.Compte;
import com.example.TpwebService.entite.TypeCompte;
import com.example.TpwebService.repository.CompteRepository;

@SpringBootApplication
public class TpwebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpwebServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));

			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}
}
