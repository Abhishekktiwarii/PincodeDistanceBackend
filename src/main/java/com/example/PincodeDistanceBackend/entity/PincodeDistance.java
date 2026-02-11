package com.example.PincodeDistanceBackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "pincode_distances",
        indexes = @Index(name = "idx_pincode_pair",
                columnList = "fromPincode, toPincode",
                unique = true))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PincodeDistance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fromPincode;

    @Column(nullable = false)
    private String toPincode;

    private Double distanceInMeters;
    private Double distanceInKm;

    private Long durationInSeconds;
    private String durationText;

    @Column(columnDefinition = "TEXT")
    private String routeOverviewPolyline;

    @Column(columnDefinition = "TEXT")
    private String fullRouteJson;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public PincodeDistance(String fromPincode, String toPincode) {
        this.fromPincode = fromPincode;
        this.toPincode = toPincode;
    }
}