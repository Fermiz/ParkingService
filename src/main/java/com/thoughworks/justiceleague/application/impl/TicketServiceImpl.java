package com.thoughworks.justiceleague.application.impl;

import com.thoughworks.justiceleague.application.TicketService;
import com.thoughworks.justiceleague.domain.parkingBoy.LicensePlateId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLot;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLotRepository;
import com.thoughworks.justiceleague.domain.ticket.Ticket;
import com.thoughworks.justiceleague.domain.ticket.TicketId;
import com.thoughworks.justiceleague.domain.ticket.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final ParkingLotRepository parkingLotRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public Ticket create(Long parkingLotId, LicensePlateId licensePlateId) {

        ParkingLot parkingLot = parkingLotRepository.find(parkingLotId);

        TicketId ticketId = new TicketId(ticketRepository.nextTicketId());
        Ticket newTicket = new Ticket(ticketId, parkingLot, licensePlateId);

        ticketRepository.save(newTicket);

        return newTicket;
    }
}
