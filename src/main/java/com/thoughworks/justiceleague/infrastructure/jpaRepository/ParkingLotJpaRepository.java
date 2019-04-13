package com.thoughworks.justiceleague.infrastructure.jpaRepository;

import com.thoughworks.justiceleague.domain.parkingBoy.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotJpaRepository extends JpaRepository<ParkingLot, Long> {
}
