/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

package com.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author msharan
 */

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String testEureka() {
        return restTemplate.getForObject("http://EUREKA-SERVICE/api/demo", String.class);
    }
}
