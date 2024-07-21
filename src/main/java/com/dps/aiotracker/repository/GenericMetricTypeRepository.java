package com.dps.aiotracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dps.aiotracker.domain.GenericMetricType;

@Repository
public interface GenericMetricTypeRepository extends JpaRepository<GenericMetricType, Long> {
}