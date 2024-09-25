// User.java
package com.college.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role; // Can be "STUDENT", "FACULTY_MEMBER", "ADMINISTRATOR"
    private String name;
    private String email;
    private String phone;

    // Getters and Setters
}
