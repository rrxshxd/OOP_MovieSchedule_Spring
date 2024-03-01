package com.example.oop_movieschedule_spring.services;

import com.example.oop_movieschedule_spring.models.Session;
import com.example.oop_movieschedule_spring.repositories.SessionRepository;
import com.example.oop_movieschedule_spring.services.Interfaces.SessionServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService implements SessionServiceInterface {
    private final SessionRepository repo;

    public SessionService(SessionRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Session> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Session> getByMovieId(int movId) {
        return repo.findByMovieId(movId);
    }

    @Override
    public Session create(Session session) {
        return repo.save(session);
    }
}
