package com.thoughworks.justiceleague.application;

import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyId;

public interface ParkingBoyInspector {

    ParkingBoy find(ParkingBoyId parkingBoyId);
}
