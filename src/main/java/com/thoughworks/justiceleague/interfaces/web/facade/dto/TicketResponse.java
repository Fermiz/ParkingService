package com.thoughworks.justiceleague.interfaces.web.facade.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TicketResponse {
    private String ticketId;

    @JsonCreator
    public TicketResponse(String ticketId) {
        this.ticketId = ticketId;
    }
}
