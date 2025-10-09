package com.codearuu.store;

import com.codearuu.store.entities.Address;
import com.codearuu.store.entities.Tag;
import com.codearuu.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        //ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .id(1L)
                .name("John Doe")
                .email("john@example.com")
                .password("password")
                .build();
        var tag = new Tag("tag1");

        user.addTag("tag1");
        user.addTag("tag2");

        System.out.println(user);
    }
}
