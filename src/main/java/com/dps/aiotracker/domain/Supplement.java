package com.dps.aiotracker.domain;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "AIOT_SUPPLEMENT_LOG")
public class Supplement {
	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "AIOT_SUPPLEMENT_SEQ", sequenceName = "AIOT_SUPPLEMENT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_SUPPLEMENT_SEQ")
	private Long id;

	@Column(name = "time")
	private Timestamp time;

	@Column(name = "amount")
	private Double amount;

	@ManyToOne
	@JoinColumn(name = "supplement_type_id")
	private SupplementType supplementType;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

}