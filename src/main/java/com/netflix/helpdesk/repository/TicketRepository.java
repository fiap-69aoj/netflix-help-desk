package com.netflix.helpdesk.repository;

import com.netflix.helpdesk.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Long> {
}
