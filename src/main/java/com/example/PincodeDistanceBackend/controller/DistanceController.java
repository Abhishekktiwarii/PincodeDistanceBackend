package com.example.PincodeDistanceBackend.controller;

import com.example.PincodeDistanceBackend.dto.DistanceResponse;
import com.example.PincodeDistanceBackend.service.GoogleMapsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/distance")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DistanceController {

    private final GoogleMapsService googleMapsService;

    @GetMapping
    public ResponseEntity<DistanceResponse> getDistance(
            @RequestParam String from,
            @RequestParam String to) {

        DistanceResponse response = googleMapsService.getDistance(from, to);

        if (response.getMessage() != null && !response.getMessage().equals("Success")) {
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Pincode Distance API is running!");
    }
}