package com.netflix.helpdesk.service;

import com.netflix.helpdesk.converter.TicketConverter;
import com.netflix.helpdesk.dto.TicketRequest;
import com.netflix.helpdesk.dto.TicketResponse;
import com.netflix.helpdesk.entity.TicketEntity;
import com.netflix.helpdesk.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketConverter ticketConverter;

    public TicketResponse save(final TicketRequest request) {
        TicketRequest requestWithStatus = request.withStatus(0);

        final TicketEntity ticketEntity = ticketConverter.toTicketEntity(requestWithStatus);
        final TicketEntity ticket = ticketRepository.save(ticketEntity);
        return ticketConverter.toTicketResponse(ticket);
    }

    public List<TicketResponse> list() {
        return ticketRepository.findAll()
            .stream().map(ticketConverter::toTicketResponse)
            .collect(Collectors.toList());
    }

}
