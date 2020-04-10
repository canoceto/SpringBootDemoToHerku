package com.demo.demo;

import com.demo.demo.Domain.User;
import com.demo.demo.Repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new User("Jack","Bauer", "Bauer@gmail.com"));
            repository.save(new User("Chloe", "O'Brian@"));
            repository.save(new User("Kim", "Bauer@"));
            repository.save(new User("David", "Palmer@"));
            repository.save(new User("Michelle", "Dessler@"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (User users : repository.findAll()) {
                log.info(users.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Optional<User> customer = repository.findById(1);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
             for (User bauer : repository.findByLastName("Bauer")) {
              log.info(bauer.toString());
             }
            log.info("");
        };
    }
}
