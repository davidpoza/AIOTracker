package com.dps.aiotracker.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AIOT_GENERIC_METRIC_TYPE")
public class GenericMetricType {
	@Id
    @Column(name="id")
    @SequenceGenerator(name = "AIOT_GENERIC_METRIC_TYPE_SEQ", sequenceName = "AIOT_GENERIC_METRIC_TYPE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_GENERIC_METRIC_TYPE_SEQ")
    private Long id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="unit")
	private String unit;
	
	@OneToMany(mappedBy = "genericMetricType", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GenericMetric> metrics;
}