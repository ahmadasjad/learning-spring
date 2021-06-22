package com.example.restservice.repository;

import com.example.restservice.entities.CsLocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocationRepository extends JpaRepository<CsLocation, Integer> {

    @Override
    Optional<CsLocation> findById(Integer id);

}
