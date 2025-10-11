package com.codearuu.store;

import com.codearuu.store.entities.User;
import com.codearuu.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);

        repository.findAll().forEach(u -> System.out.println(u.getEmail()));
        repository.deleteById(1L);
        repository.deleteAll();
    }
}
