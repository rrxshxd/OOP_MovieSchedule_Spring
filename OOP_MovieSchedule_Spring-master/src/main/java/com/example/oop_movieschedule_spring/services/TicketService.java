package com.example.oop_movieschedule_spring.services;

import com.example.oop_movieschedule_spring.models.Ticket;
import com.example.oop_movieschedule_spring.repositories.TicketRepository;
import com.example.oop_movieschedule_spring.services.Interfaces.TicketServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TicketService implements TicketServiceInterface{
    private final TicketRepository repo;

    public TicketService(TicketRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Ticket> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Ticket> getTicketsById(int sessionId, int movId) {
        return repo.getTicketsById(sessionId, movId);
    }

    @Override
    public Boolean isBooked(int ticketId, int sessionId, int movId){
        return repo.isBooked(ticketId, sessionId, movId);
    }

    @Override
    public Void bookTicket(int ticketId, int sessionId, int movId, String customerName){
        return repo.bookTicket(ticketId, sessionId, movId);
    }

    @Override
    public Ticket create(Ticket ticket) {
        return repo.save(ticket);
    }
}
