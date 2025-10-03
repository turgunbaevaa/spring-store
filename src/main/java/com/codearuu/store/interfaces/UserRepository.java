package com.codearuu.store.interfaces;

import com.codearuu.store.User;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
