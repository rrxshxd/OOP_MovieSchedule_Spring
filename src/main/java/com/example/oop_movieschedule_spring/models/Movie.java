package com.example.oop_movieschedule_spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="movies_1")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String genre;
    private int releaseYear;
}
