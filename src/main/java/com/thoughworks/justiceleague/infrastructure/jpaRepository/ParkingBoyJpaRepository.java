package com.thoughworks.justiceleague.infrastructure.jpaRepository;

import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingBoyJpaRepository extends JpaRepository<ParkingBoy, ParkingBoyId> {
}
