package com.thoughworks.justiceleague.infrastructure.memoryRepository;

import com.thoughworks.justiceleague.domain.parkingBoy.IllegalTicketException;
import com.thoughworks.justiceleague.domain.ticket.Ticket;
import com.thoughworks.justiceleague.domain.ticket.TicketId;
import com.thoughworks.justiceleague.domain.ticket.TicketRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TicketRepositoryMemoryImpl implements TicketRepository {

    private List<Ticket> tickets = new ArrayList<>();

    @Override
    public void save(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public String nextTicketId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public Ticket find(TicketId ticketId) {
        return tickets.stream().filter(it -> it.getTicketId().sameValueAs(ticketId)).findFirst().orElseThrow(IllegalTicketException::new);
    }
}