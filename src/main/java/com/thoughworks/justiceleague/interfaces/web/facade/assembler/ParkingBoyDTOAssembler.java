package com.thoughworks.justiceleague.interfaces.web.facade.assembler;

import com.thoughworks.justiceleague.domain.parkingBoy.ParkingBoy;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.ParkingBoyDTO;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.ParkingLotDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingBoyDTOAssembler {

    public static ParkingBoyDTO toDTO(ParkingBoy parkingBoy) {

        List<ParkingLotDTO> parkingLotDTOList = parkingBoy
                .getParkingLot().stream()
                .map(lot -> ParkingLotDTO.builder()
                        .capacity(lot.getCapacity()).build())
                .collect(Collectors.toList());

        return ParkingBoyDTO.builder()
                .parkingBoyId(parkingBoy.getParkingBoyId().toString())
                .parkingLots(parkingLotDTOList)
                .name(parkingBoy.getName())
                .build();
    };
}
