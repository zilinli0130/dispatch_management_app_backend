package com.flagteam.dispatchmanagementapp.repository;

import com.flagteam.dispatchmanagementapp.model.DeliveryInfo;
import com.flagteam.dispatchmanagementapp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> {
    Location findByDeliveryInfo(DeliveryInfo deliveryInfo);
}
