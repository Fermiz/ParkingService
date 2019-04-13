package com.thoughworks.justiceleague.application.impl;

import com.thoughworks.justiceleague.application.ParkingBoyInspector;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyRepository;
import com.thoughworks.justiceleague.infrastructure.jpaRepository.ParkingBoyJpaRepository;
import com.thoughworks.justiceleague.infrastructure.jpaRepository.impl.ParkingBoyRepositoryJpaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingBoyInspectorImpl implements ParkingBoyInspector {

    private final ParkingBoyRepositoryJpaImpl parkingBoyRepository;

    @Autowired
    public ParkingBoyInspectorImpl(ParkingBoyRepositoryJpaImpl parkingBoyRepository) {
        this.parkingBoyRepository = parkingBoyRepository;
    }

    @Override
    public ParkingBoy find(ParkingBoyId parkingBoyId) {
        return parkingBoyRepository.find(parkingBoyId);
    }
}
