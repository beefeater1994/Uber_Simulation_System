package com.eric.spring.uber.service;

import com.eric.spring.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocationService {
    List<Location> saveCarLocations(List<Location> carLocations);
    void deleteAll();
    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);
    Page<Location> findByVin(String vin, Pageable pageable);
}
