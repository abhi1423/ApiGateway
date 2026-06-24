package com.gateway.ApiGateway.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallback/transporter")
    public ResponseEntity<String> transporterFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Transporter Service is currently unavailable. Please try again later.");
    }

    @GetMapping("/fallback/consumer")
    public ResponseEntity<String> consumerFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Consumer Service is currently unavailable.");
    }
}
