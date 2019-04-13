package com.thoughworks.justiceleague.application.impl;

import com.thoughworks.justiceleague.application.ParkingService;
import com.thoughworks.justiceleague.domain.parkingBoy.*;
import com.thoughworks.justiceleague.domain.ticket.Ticket;
import com.thoughworks.justiceleague.domain.ticket.TicketId;
import com.thoughworks.justiceleague.domain.ticket.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingServiceImpl implements ParkingService {

    private final ParkingBoyRepository parkingBoyRepository;
    private final ParkingLotRepository parkingLotRepository;
    private final TicketRepository ticketRepository;

    @Autowired
    public ParkingServiceImpl(ParkingBoyRepository parkingBoyRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.parkingBoyRepository = parkingBoyRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public ParkingLot parking(ParkingBoyId parkingBoyId, LicensePlateId licensePlateId) {
        ParkingBoy parkingBoy = parkingBoyRepository.find(parkingBoyId);

        ParkingLot parkingLot = parkingBoy.park(licensePlateId);
        parkingLotRepository.save(parkingLot);

        return parkingLot;
    }

    @Override
    public ParkingBoy get(ParkingBoyId parkingBoyId) {
        return parkingBoyRepository.find(parkingBoyId);
    }

    @Override
    public LicensePlateId pick(TicketId ticketId) {
        Ticket ticket = ticketRepository.find(ticketId);
        ParkingBoy parkingBoy = parkingBoyRepository.find(ticket.getParkingLot().getParkingBoyId());
        return parkingBoy.pick(ticket.getLicensePlateId());
    }
}
