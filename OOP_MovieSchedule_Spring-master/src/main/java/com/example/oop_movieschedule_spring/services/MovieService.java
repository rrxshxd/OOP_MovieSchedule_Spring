package com.example.oop_movieschedule_spring.services;

import com.example.oop_movieschedule_spring.models.Movie;
import com.example.oop_movieschedule_spring.repositories.MovieRepository;
import com.example.oop_movieschedule_spring.services.Interfaces.MovieServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements MovieServiceInterface {
    private final MovieRepository repo;

    public MovieService(MovieRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Movie> getAll() {
        return repo.findAll();
    }

    @Override
    public Movie getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public String getMovieNameById(int id) {
        return repo.getMovieNameById(id);
    }

    @Override
    public Movie create(Movie movie) {
        return repo.save(movie);
    }

    @Override
    public Movie deleteById(int id) {
        Optional<Movie> movie = repo.findById(id);
        if(movie.isPresent()){
            repo.deleteById(id);
            return movie.get();
        }
        else{
            return null;
        }
    }
}
