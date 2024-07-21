package com.dps.aiotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dps.aiotracker.domain.SupplementType;

@Repository
public interface SupplementTypeRepository extends JpaRepository<SupplementType, Long> {
}