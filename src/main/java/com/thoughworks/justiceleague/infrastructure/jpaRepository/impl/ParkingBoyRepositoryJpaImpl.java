package com.thoughworks.justiceleague.infrastructure.jpaRepository.impl;

import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyId;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyRepository;
import com.thoughworks.justiceleague.infrastructure.jpaRepository.ParkingBoyJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkingBoyRepositoryJpaImpl implements ParkingBoyRepository {

    private final ParkingBoyJpaRepository repository;

    @Autowired
    public ParkingBoyRepositoryJpaImpl(ParkingBoyJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public ParkingBoy find(ParkingBoyId parkingBoyId) {
        ParkingBoy parkingBoy = repository
                .findById(parkingBoyId)
                .orElse(null);

        return parkingBoy;
    }

    @Override
    public void save(ParkingBoy parkingBoy) {
        repository.saveAndFlush(parkingBoy);
    }
}
