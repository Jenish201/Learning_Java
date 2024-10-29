package com.example.spring_boot_blog_app.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String password;
    private String email;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "account")
    private List<Post> posts;
}
