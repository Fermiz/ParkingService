package com.thoughworks.justiceleague.interfaces.web.facade.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TicketRequest {
    private Long parkingLotId;
    private String licensePlateId;
}
