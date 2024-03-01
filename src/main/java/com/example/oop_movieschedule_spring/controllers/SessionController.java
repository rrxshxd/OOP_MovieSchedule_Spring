package com.example.oop_movieschedule_spring.controllers;

import com.example.oop_movieschedule_spring.models.Session;
import com.example.oop_movieschedule_spring.services.interfaces.SessionServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
