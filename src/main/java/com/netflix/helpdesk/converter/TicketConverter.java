package com.netflix.helpdesk.converter;

import com.netflix.helpdesk.dto.TicketRequest;
import com.netflix.helpdesk.dto.TicketResponse;
import com.netflix.helpdesk.entity.TicketEntity;
import org.springframework.stereotype.Component;

@Component
public class TicketConverter {

    public TicketEntity toTicketEntity(final TicketRequest request) {
        return TicketEntity.builder()
            .idUser(request.getIdUser())
            .description(request.getDescription())
            .startDate(request.getStartDate())
            .endDate(request.getEndDate())
            .status(request.getStatus())
            .build();
    }

    public TicketResponse toTicketResponse(final TicketEntity ticketEntity) {
        return TicketResponse.builder()
            .id(ticketEntity.getId())
            .idUser(ticketEntity.getIdUser())
            .description(ticketEntity.getDescription())
            .startDate(ticketEntity.getStartDate())
            .endDate(ticketEntity.getEndDate())
            .status(ticketEntity.getStatus())
            .build();
    }

}
