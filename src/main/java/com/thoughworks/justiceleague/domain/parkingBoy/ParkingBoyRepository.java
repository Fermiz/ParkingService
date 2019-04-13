package com.thoughworks.justiceleague.domain.parkingBoy;

public interface ParkingBoyRepository {
    ParkingBoy find(ParkingBoyId parkingBoyId);
    void save(ParkingBoy parkingBoy);
}
