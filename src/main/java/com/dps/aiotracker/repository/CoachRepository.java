package com.dps.aiotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dps.aiotracker.domain.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
}