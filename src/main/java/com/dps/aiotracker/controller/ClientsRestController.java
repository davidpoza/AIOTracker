package com.dps.aiotracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/clients")
@Tag(name = "Clients")
@Api(value = "API to search Student from a Student Repository by different search parameters",
description = "This API provides the capability to search Student from a Student Repository", produces = "application/json")
public class ClientsRestController {

    @Operation(summary = "This method is used to get the clients.")
    @GetMapping
    public List<String> getClients() {
        return Arrays.asList("First Client", "Second Client");
    }
}