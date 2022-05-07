package com.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarbageController {

    @GetMapping(value = "/")
    public String getIndex() {
        return "this is index";
    }
}
