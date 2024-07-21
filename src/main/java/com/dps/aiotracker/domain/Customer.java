package com.dps.aiotracker.domain;

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
@Table(name = "AIOT_CUSTOMER")
public class Customer {
	@Id
    @Column(name="id")
    @SequenceGenerator(name = "AIOT_CUSTOMER_SEQ", sequenceName = "AIOT_CUSTOMER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AIOT_CUSTOMER_SEQ")
    private Long id;
	
	@Column(name="name")
	private String name;
	 
	@Column(name="email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name="coach_id")
	private Coach coach;
	
	
}
