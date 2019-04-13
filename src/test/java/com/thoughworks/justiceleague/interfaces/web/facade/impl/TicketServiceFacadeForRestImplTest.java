package com.thoughworks.justiceleague.interfaces.web.facade.impl;

import com.thoughworks.justiceleague.domain.ticket.Ticket;
import com.thoughworks.justiceleague.infrastructure.routing.ExternalParkingLotService;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.TicketRequest;
import com.thoughworks.justiceleague.interfaces.web.facade.dto.TicketResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TicketServiceFacadeForRestImplTest {

    @Mock
    private ExternalParkingLotService externalParkingLotService;

    private TicketServiceFacadeForRestImpl ticketServiceFacadeForRest;

    @Test
    public void should_return_ticket() {
        //given
        ticketServiceFacadeForRest = new TicketServiceFacadeForRestImpl(externalParkingLotService);
        //when
        when(externalParkingLotService.createTicket(any(TicketRequest.class))).thenReturn(TicketResponse.builder().build());
        Ticket ticket = ticketServiceFacadeForRest.create(1L, "111");
        //then
        assertNotNull(ticket.getTicketId());
    }
}