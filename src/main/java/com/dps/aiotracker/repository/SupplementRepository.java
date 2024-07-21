package com.dps.aiotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dps.aiotracker.domain.Supplement;

@Repository
public interface SupplementRepository extends JpaRepository<Supplement, Long> {
}