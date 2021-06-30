package com.example.restservice;

import com.example.restservice.entities.CsLocation;
import com.example.restservice.entities.CsRestaurant;
import com.example.restservice.repository.LocationRepository;
import com.example.restservice.repository.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LocationController {

    LocationRepository repository;
    RestaurantRepository restaurantRepository;

    LocationController(LocationRepository repository, RestaurantRepository restaurantRepository) {
        this.repository = repository;
        this.restaurantRepository  = restaurantRepository;
    }

    @GetMapping("/location/{id}/restaurant")
    public CsRestaurant getRestaurant(@PathVariable Integer id) {
        Optional<CsLocation> location = repository.findById(id);
        return location.get().getRestaurant();
    }
}
