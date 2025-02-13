package com.oauth2.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
    private String oauth2Provider;
    private String oauth2Id;
    private LocalDateTime createdAt;

    // Getters and Setters
}