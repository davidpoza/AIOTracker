package com.dps.aiotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dps.aiotracker.domain.GenericMetric;

@Repository
public interface GenericMetricRepository extends JpaRepository<GenericMetric, Long> {
}