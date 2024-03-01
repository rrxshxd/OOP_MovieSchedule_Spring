package com.example.oop_movieschedule_spring.services.Interfaces;

import com.example.oop_movieschedule_spring.models.Ticket;

import java.util.List;

public interface TicketServiceInterface {
    List<Ticket> getAll();
    List<Ticket> getTicketsById(int sessionId, int movId);
    Boolean isBooked(int ticketId, int sessionId, int movId);
    Void bookTicket(int ticketId, int sessionId, int movId, String customerName);
    Ticket create(Ticket ticket);
}
