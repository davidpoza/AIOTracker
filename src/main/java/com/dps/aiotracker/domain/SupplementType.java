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
@Table(name = "AIOT_SUPPLEMENT_TYPE")
public class SupplementType {
	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "AIOT_SUPPLEMENT_TYPE_SEQ", sequenceName = "AIOT_SUPPLEMENT_TYPE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_SUPPLEMENT_TYPE_SEQ")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "unit")
	private String unit;

	@OneToMany(mappedBy = "supplementType", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Supplement> supplements;
}