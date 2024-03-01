package com.example.oop_movieschedule_spring.repositories;

import com.example.oop_movieschedule_spring.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session,Integer> {
    List<Session> findByMovieId(int movieId);
}
