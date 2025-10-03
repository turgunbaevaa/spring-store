package com.codearuu.store;

import com.codearuu.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "nyc.aruu@gmail.com", "43263562", "Aruuke"));
        userService.registerUser(new User(1L, "nyc.aru@gmail.com", "43263562", "Aruuke"));
    }
}
