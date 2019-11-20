package com.netflix.helpdesk.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
public class TicketResponse implements Serializable {

    private static final long serialVersionUID = 3013453546076616129L;

    private final Long id;
    private final Long idUser;
    private final Date startDate;
    private final Date endDate;
    private final Integer status;
    private final String description;


}
