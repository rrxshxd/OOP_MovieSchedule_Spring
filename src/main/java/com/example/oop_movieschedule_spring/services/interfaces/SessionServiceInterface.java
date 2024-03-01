package com.example.oop_movieschedule_spring.services.interfaces;

import com.example.oop_movieschedule_spring.models.Session;

import java.util.List;

public interface SessionServiceInterface {
    List<Session> getAll();
    Session getByMovieId(int movieId);
    Session getById(int sessionId);
    Session create(Session session);
    Session deleteBySessionId(int sessionId);
}
