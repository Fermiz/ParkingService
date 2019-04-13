package com.thoughworks.justiceleague.interfaces.web.facade.impl;

import com.thoughworks.justiceleague.domain.ticket.Ticket;
import com.thoughworks.justiceleague.domain.ticket.TicketId;
import com.thoughworks.justiceleague.infrastructure.routing.ExternalParkingLotService;
import com.thoughworks.justiceleague.interfaces.web.facade.TicketServiceFacade;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.TicketRequest;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceFacadeImpl implements TicketServiceFacade {

    private ExternalParkingLotService externalParkingLotService;

    @Autowired
    public TicketServiceFacadeImpl(ExternalParkingLotService externalParkingLotService) {
        this.externalParkingLotService = externalParkingLotService;
    }

    @Override
    public Ticket create(Long parkingLotId, String licensePlateId) {
        TicketResponse ticketResponse = externalParkingLotService.createTicket((TicketRequest.builder().
                parkingLotId(parkingLotId).licensePlateId(licensePlateId).build()));

        TicketId ticketId = TicketId.builder().uuid(ticketResponse.getTicketId()).build();
        return Ticket.builder().ticketId(ticketId).build();
    }
}
