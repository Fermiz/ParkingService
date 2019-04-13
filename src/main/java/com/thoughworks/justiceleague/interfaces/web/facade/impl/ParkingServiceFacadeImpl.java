package com.thoughworks.justiceleague.interfaces.web.facade.impl;

import com.thoughworks.justiceleague.application.ParkingService;
import com.thoughworks.justiceleague.domain.parkingBoy.LicensePlateId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLot;
import com.thoughworks.justiceleague.domain.ticket.TicketId;
import com.thoughworks.justiceleague.interfaces.web.facade.ParkingServiceFacade;
import com.thoughworks.justiceleague.interfaces.web.facade.assembler.ParkingBoyDTOAssembler;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.ParkingBoyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingServiceFacadeImpl implements ParkingServiceFacade {

    private final ParkingService parkingService;

    @Autowired
    public ParkingServiceFacadeImpl(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @Override
    public ParkingBoyDTO find(String parkingBoyId) {
        ParkingBoy boy = parkingService
                .get(new ParkingBoyId(parkingBoyId));

        return ParkingBoyDTOAssembler.toDTO(boy);
    }

    @Override
    public ParkingLot parking(String parkingBoyId, String licensePlateNumber) {
        return parkingService.parking(new ParkingBoyId(parkingBoyId), new LicensePlateId(licensePlateNumber));
    }

    @Override
    public LicensePlateId pick(String ticketId) {
        return parkingService.pick(new TicketId(ticketId));
    }


}
