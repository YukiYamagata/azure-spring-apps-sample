package com.example.spiringapps.service.impl;

import com.example.spiringapps.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class DefaultGreetingService implements GreetingService {
    private final Clock clock;

    @Override
    public String greet() {
        final Instant instant = clock.instant();
        final ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        final int hour = Integer.parseInt(DateTimeFormatter.ofPattern("HH").format(zdt));

        if (0 <= hour && hour < 12) {
            return "Good morning.";
        } else if (12 <= hour && hour < 18) {
            return "Good afternoon.";
        } else {
            return "Good evening.";
        }
    }
}
