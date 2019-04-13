package com.thoughworks.justiceleague.infrastructure.routing;

import com.thoughworks.justiceleague.interfaces.web.facade.dto.TicketRequest;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.TicketResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "parking-lot-service", url = "${parking-lot-service.url}")
@Component
public interface ExternalParkingLotService {

    @PostMapping("tickets")
    @Headers("Content-Type: application/json")
    TicketResponse createTicket(TicketRequest ticketRequest);

}
