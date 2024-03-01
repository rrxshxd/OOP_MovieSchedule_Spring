package com.example.oop_movieschedule_spring.repositories;

import com.example.oop_movieschedule_spring.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
