package com.enuch.microserviceevents.repositories;

import com.enuch.microserviceevents.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
