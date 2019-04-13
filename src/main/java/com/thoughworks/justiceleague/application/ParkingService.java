package com.thoughworks.justiceleague.application;

import com.thoughworks.justiceleague.domain.parkingBoy.LicensePlateId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLot;
import com.thoughworks.justiceleague.domain.ticket.TicketId;


public interface ParkingService {
    ParkingLot parking(ParkingBoyId parkingBoyId, LicensePlateId licensePlateId);
    ParkingBoy get(ParkingBoyId parkingBoyId);
    LicensePlateId pick(TicketId ticketId);

}
