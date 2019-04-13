package com.thoughworks.justiceleague.interfaces.web.facade.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class TicketResponse {
    private String ticketId;
}
