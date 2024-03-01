package com.example.oop_movieschedule_spring.repositories;

import com.example.oop_movieschedule_spring.models.Movie;
import com.example.oop_movieschedule_spring.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer> {
}
