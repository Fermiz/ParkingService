package com.thoughworks.justiceleague.application;

import com.thoughworks.justiceleague.domain.parkingBoy.LicensePlateId;
import com.thoughworks.justiceleague.domain.ticket.Ticket;

public interface TicketService {
    Ticket create(Long parkingLotId, LicensePlateId licensePlateId);
}
