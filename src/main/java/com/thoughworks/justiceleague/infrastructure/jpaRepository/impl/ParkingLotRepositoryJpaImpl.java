package com.thoughworks.justiceleague.infrastructure.jpaRepository.impl;

import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLot;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLotRepository;
import com.thoughworks.justiceleague.infrastructure.jpaRepository.ParkingLotJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkingLotRepositoryJpaImpl implements ParkingLotRepository {

    private final ParkingLotJpaRepository repository;

    @Autowired
    public ParkingLotRepositoryJpaImpl(ParkingLotJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public ParkingLot find(Long parkingLotId) {
        return repository.findById(parkingLotId).orElse(null);
    }

    @Override
    public void save(ParkingLot parkingLot) {
        repository.saveAndFlush(parkingLot);
    }
}
