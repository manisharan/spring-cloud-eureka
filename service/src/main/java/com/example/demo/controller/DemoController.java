/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author msharan
 */
@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return "test pass";
    }
}
