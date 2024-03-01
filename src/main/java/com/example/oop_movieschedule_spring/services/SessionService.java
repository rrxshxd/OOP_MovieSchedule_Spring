package com.example.oop_movieschedule_spring.services;

import com.example.oop_movieschedule_spring.models.Session;
import com.example.oop_movieschedule_spring.repositories.SessionRepository;
import com.example.oop_movieschedule_spring.services.interfaces.SessionServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Session getByMovieId(int movieId) {
        return repo.findById(movieId).orElse(null);
    }

    @Override
    public Session getById(int sessionId) {
        return repo.findById(sessionId).orElse(null);
    }

    @Override
    public Session create(Session session) {
        return repo.save(session);
    }

    @Override
    public Session deleteBySessionId(int sessionId){
        Optional<Session> session = repo.findById(sessionId);
        if(session.isPresent()){
            repo.deleteById(sessionId);
            return session.get();
        }
        else{
            return null;
        }
    }
}
