package com.dps.aiotracker.domain;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "AIOT_GENERIC_METRIC")
public class GenericMetric {
	@Id
    @Column(name="id")
    @SequenceGenerator(name = "AIOT_GENERIC_METRIC_SEQ", sequenceName = "AIOT_GENERIC_METRIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_GENERIC_METRIC_SEQ")
    private Long id;
	
	
	@Column(name="time")
	private Timestamp time;
	
	@OneToMany(mappedBy = "genericMetric", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Photo> photos;
	
	
	@ManyToOne
	@JoinColumn(name="generic_metric_type_id")
	private GenericMetricType genericMetricType;
	
}