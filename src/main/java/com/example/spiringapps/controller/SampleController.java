package com.example.spiringapps.controller;

import com.example.spiringapps.controller.model.GreetingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sample")
@RestController
@RequiredArgsConstructor
public class SampleController {
    @GetMapping(path = "/greet")
    public GreetingResponse greet() {
        return GreetingResponse.builder().word("Hello Spring Apps Sample").build();
    }
}
