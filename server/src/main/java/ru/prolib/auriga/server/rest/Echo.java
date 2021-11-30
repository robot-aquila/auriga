package ru.prolib.auriga.server.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Echo {

    @GetMapping("/api/v1/echo")
    public LocalDateTime echo() {
        return LocalDateTime.now();
    }
}
