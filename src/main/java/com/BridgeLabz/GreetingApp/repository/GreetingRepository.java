package com.BridgeLabz.GreetingApp.repository;

import com.BridgeLabz.GreetingApp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
