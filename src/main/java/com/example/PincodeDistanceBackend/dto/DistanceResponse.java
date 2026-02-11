package com.example.PincodeDistanceBackend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DistanceResponse {
    private String fromPincode;
    private String toPincode;
    private Double distanceInKm;
    private String distanceText;
    private String durationText;
    private Long durationInSeconds;
    private String routePolyline;
    private String source;
    private String message;

    public DistanceResponse(String fromPincode, String toPincode, String message) {
        this.fromPincode = fromPincode;
        this.toPincode = toPincode;
        this.message = message;
    }
}