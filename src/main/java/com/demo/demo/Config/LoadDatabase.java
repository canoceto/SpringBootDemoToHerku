package com.demo.demo.Config;

import lombok.extern.slf4j.Slf4j;

import com.demo.demo.Domain.User;
import com.demo.demo.Repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {
    return args -> {
  //    log.info("Preloading " + repository.save(new User("Carlos", "carls@correo.com")));
    //  log.info("Preloading " + repository.save(new User("Pepe Cojo", "pepecojo@correo.com")));
    };
  }
}