package com.thoughworks.justiceleague.interfaces.web.facade;

import com.thoughworks.justiceleague.domain.parkingBoy.LicensePlateId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLot;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.ParkingBoyDTO;

public interface ParkingServiceFacade {
    ParkingBoyDTO find(String parkingBoyId);

    ParkingLot parking(String parkingBoyId, String licensePlateNumber);

    LicensePlateId pick(String ticketId);
}
