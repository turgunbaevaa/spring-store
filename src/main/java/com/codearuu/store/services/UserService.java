package com.codearuu.store.services;

import com.codearuu.store.entities.User;
import com.codearuu.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates(){
        var user = User.builder()
                .name("John Doe")
                .email("john@example.com")
                .password("password")
                .build();

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }

        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }
    }
}
