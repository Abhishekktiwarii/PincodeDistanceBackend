package com.example.PincodeDistanceBackend.repository;

import com.example.PincodeDistanceBackend.entity.PincodeDistance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PincodeDistanceRepository extends JpaRepository<PincodeDistance, Long> {

    Optional<PincodeDistance> findByFromPincodeAndToPincode(String fromPincode, String toPincode);

    boolean existsByFromPincodeAndToPincode(String fromPincode, String toPincode);
}