package com.example.oop_movieschedule_spring.services.Interfaces;

import com.example.oop_movieschedule_spring.models.Session;

import java.util.List;

public interface SessionServiceInterface {
    List<Session> getAll();
    List<Session> getByMovieId(int movId);
    Session create(Session session);
}
