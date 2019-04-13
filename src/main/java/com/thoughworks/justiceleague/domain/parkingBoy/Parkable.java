package com.thoughworks.justiceleague.domain.parkingBoy;

public interface Parkable {
    ParkingLot park(LicensePlateId licensePlateId);
    int availableCapacity();
    LicensePlateId pick(LicensePlateId ticket);
}
