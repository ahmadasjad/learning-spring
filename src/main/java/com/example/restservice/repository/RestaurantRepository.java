package com.example.restservice.repository;

import com.example.restservice.entities.CsRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<CsRestaurant, Integer> {
    @Override
    Optional<CsRestaurant> findById(Integer aLong);
}
