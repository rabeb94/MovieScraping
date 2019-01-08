package com.scrape.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrape.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    
    //je les ai utilisé dans authrest api
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}