package com.example.oop_movieschedule_spring.controllers;

import com.example.oop_movieschedule_spring.models.Movie;
import com.example.oop_movieschedule_spring.services.interfaces.MovieServiceInterface;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {

    private final MovieServiceInterface service;

    public MovieController(MovieServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Movie> getAll(){
        return service.getAll();
    }

    @GetMapping("/{movie_id}")
    public ResponseEntity<Movie> getById(@PathVariable("movie_id") int id){
        Movie movie = service.getById(id);
        if (movie == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Movie> create(@RequestBody Movie movie){
        Movie createdMovie = service.create(movie);
        if(createdMovie == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(movie,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id){
        Movie movie = service.deleteById(id);
        if(movie == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
