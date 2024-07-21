package com.dps.aiotracker.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "AIOT_PHOTO")
public class Photo {
	@Id
    @Column(name="id")
    @SequenceGenerator(name = "AIOT_PHOTO_SEQ", sequenceName = "AIOT_PHOTO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_PHOTO_SEQ")
    private Long id;
	
	
	@Column(name="description")
	private String description;
	
	@OneToOne
	@JoinColumn(name="photo_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="generic_metric_id")
	private GenericMetric genericMetric;
}