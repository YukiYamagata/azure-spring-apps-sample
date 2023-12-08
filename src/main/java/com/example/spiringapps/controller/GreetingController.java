package com.example.spiringapps.controller;

import com.example.spiringapps.controller.model.GreetingResponse;
import com.example.spiringapps.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService service;

    @GetMapping(path = "/greet")
    public GreetingResponse greet() {
        final String word = service.greet();
        return new GreetingResponse(word);
    }
}
