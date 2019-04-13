package com.thoughworks.justiceleague.domain.parkingBoy;

public interface ParkingLotRepository {
    ParkingLot find(Long parkingLotId);
    void save(ParkingLot parkingLot);
}
