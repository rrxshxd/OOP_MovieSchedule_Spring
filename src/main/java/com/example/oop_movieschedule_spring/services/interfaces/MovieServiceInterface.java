package com.example.oop_movieschedule_spring.services.interfaces;

import com.example.oop_movieschedule_spring.models.Movie;

import java.util.List;

public interface MovieServiceInterface {
    List<Movie> getAll();
    Movie getById(int id);
    Movie create(Movie movie);
    Movie deleteById(int id);
}
