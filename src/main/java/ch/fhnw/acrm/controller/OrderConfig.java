package ch.fhnw.acrm.controller;


import ch.fhnw.acrm.data.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ProductRepository repository) {
        return  args -> {


        };

    }
}
