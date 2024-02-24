package com.example.oop_movieschedule_spring.repositories;

import com.example.oop_movieschedule_spring.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
