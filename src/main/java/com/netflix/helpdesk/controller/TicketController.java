package com.netflix.helpdesk.controller;

import com.netflix.helpdesk.dto.TicketRequest;
import com.netflix.helpdesk.dto.TicketResponse;
import com.netflix.helpdesk.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketResponse> save(@Valid @RequestBody final TicketRequest request) {
        final TicketResponse ticket = ticketService.save(request);
        return ResponseEntity.created(URI.create("/tickets/" + ticket.getId())).build();
    }

    @GetMapping
    public ResponseEntity<List<TicketResponse>> list() {
        return ResponseEntity.ok(ticketService.list());
    }

}
