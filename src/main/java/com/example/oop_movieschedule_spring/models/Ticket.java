package com.example.oop_movieschedule_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table()
public class Ticket {
    @Id
    @GeneratedValue
    private int id;
    private int ticketId;
    private int sessionId;
    private String movieName;
    private boolean isBooked;
}
