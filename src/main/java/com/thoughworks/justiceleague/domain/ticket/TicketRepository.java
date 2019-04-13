package com.thoughworks.justiceleague.domain.ticket;

public interface TicketRepository {

    void save(Ticket ticket);

    String nextTicketId();

    Ticket find(TicketId ticketId);
}
