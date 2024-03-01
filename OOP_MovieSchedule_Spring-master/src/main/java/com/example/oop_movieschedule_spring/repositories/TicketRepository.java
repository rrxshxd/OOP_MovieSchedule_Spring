package com.example.oop_movieschedule_spring.repositories;

import com.example.oop_movieschedule_spring.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> getTicketsById(int sessionId, int movId);
    Boolean isBooked(int ticketId, int sessionId, int movId);
    Void bookTicket(int ticketId,int sessionId,int movId);

}