package com.example.oop_movieschedule_spring.controllers;

import com.example.oop_movieschedule_spring.models.Movie;
import com.example.oop_movieschedule_spring.models.Session;
import com.example.oop_movieschedule_spring.services.Interfaces.SessionServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sessions")
public class SessionController {
    private final SessionServiceInterface service;
    public SessionController(SessionServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Session> getAll(){
        return service.getAll();
    }

    @GetMapping("/{movie_id}")
    public List<Session> getByMovieId(@PathVariable("movie_id") int id){
        return service.getByMovieId(id);
    }

    @PostMapping("/")
    public ResponseEntity<Session> create(@RequestBody Session session){
        Session createdSession = service.create(session);
        if(createdSession == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(session,HttpStatus.CREATED);
    }
}