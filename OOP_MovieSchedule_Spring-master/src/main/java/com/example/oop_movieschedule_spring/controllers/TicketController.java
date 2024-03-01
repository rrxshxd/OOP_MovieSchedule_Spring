package com.example.oop_movieschedule_spring.controllers;

import com.example.oop_movieschedule_spring.models.Session
import com.example.oop_movieschedule_spring.models.Ticket;
import com.example.oop_movieschedule_spring.services.Interfaces.TicketServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tickets")
public class TicketController {
    private final TicketServiceInterface service;
    public TicketController(TicketServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Ticket> getAll(){
        return service.getAll();
    }

    @GetMapping("/{movie_id}")
    public List<Ticket> getTicketsById(@PathVariable("movie_id") int id){
        return service.getByMovieId(id);
    }


}