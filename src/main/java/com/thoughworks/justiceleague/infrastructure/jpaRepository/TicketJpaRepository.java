package com.thoughworks.justiceleague.infrastructure.jpaRepository;

import com.thoughworks.justiceleague.domain.ticket.Ticket;
import com.thoughworks.justiceleague.domain.ticket.TicketId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketJpaRepository extends JpaRepository<Ticket, TicketId> {
}
