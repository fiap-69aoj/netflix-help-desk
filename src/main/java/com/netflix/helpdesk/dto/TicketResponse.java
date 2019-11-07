package com.netflix.helpdesk.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
public class TicketResponse implements Serializable {

    private static final long serialVersionUID = 3013453546076616129L;

    private Long id;

}
