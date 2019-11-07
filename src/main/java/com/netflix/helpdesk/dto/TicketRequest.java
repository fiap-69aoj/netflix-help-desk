package com.netflix.helpdesk.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.With;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Builder
@Getter
@ToString
@With
public class TicketRequest implements Serializable {

    private static final long serialVersionUID = -4262965849599784188L;

    @NotNull
    private final Long idUser;

    @NotNull
    private final String description;

    @NotNull
    private final Date startDate;

    private final Date endDate;

    private final Integer status;

}
