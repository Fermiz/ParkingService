package com.thoughworks.justiceleague.interfaces.web.facade;

import com.thoughworks.justiceleague.domain.ticket.Ticket;

public interface TicketServiceFacade {
    Ticket create(Long parkingLotId, String licensePlateId);
}
