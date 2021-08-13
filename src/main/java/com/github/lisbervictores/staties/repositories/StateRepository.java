package com.github.lisbervictores.staties.repositories;

import com.github.lisbervictores.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
