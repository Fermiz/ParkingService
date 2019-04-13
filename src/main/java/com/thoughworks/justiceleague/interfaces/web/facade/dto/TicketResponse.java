package com.thoughworks.justiceleague.interfaces.web.facade.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class TicketResponse {
    private String ticketId;
}
