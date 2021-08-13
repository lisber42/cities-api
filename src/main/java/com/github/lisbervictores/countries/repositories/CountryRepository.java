package com.github.lisbervictores.countries.repositories;

import com.github.lisbervictores.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
